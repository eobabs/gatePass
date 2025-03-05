package org.bytebuilders.estateManger.services;

import lombok.RequiredArgsConstructor;
import org.bytebuilders.estateManger.data.models.House;
import org.bytebuilders.estateManger.data.models.Resident;
import org.bytebuilders.estateManger.data.repositories.HouseRepository;
import org.bytebuilders.estateManger.data.repositories.ResidentRepository;
import org.bytebuilders.estateManger.dtos.requests.ResidentRequestDTO;
import org.bytebuilders.estateManger.dtos.responses.ResidentResponseDTO;
import org.bytebuilders.estateManger.utils.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ResidentService implements ResidentServiceable {

    @Autowired
    private final ResidentRepository residentRepository;
    @Autowired
    private final HouseRepository houseRepository;
    private final Mappers mapper;

    @Transactional
    public ResidentResponseDTO registerResident(ResidentRequestDTO residentRequestDTO) {

        validateResidentRequest(residentRequestDTO);

        House house = createHouse(residentRequestDTO);
        House savedHouse = houseRepository.save(house);

        Resident resident = mapper.toResident(residentRequestDTO);
        resident.setHouse(savedHouse);
        Resident savedResident = residentRepository.save(resident);

        savedHouse.setCurrentResident(savedResident);
        houseRepository.save(savedHouse);

        return mapper.toResidentResponseDTO(savedResident);
    }

    private void validateResidentRequest(ResidentRequestDTO requestDTO) {
        if (requestDTO == null) {
            throw new IllegalArgumentException("Resident request cannot be null");
        }

        if (requestDTO.getName() == null || requestDTO.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Resident name is required");
        }

        if (requestDTO.getHouseNumber() == null || requestDTO.getHouseNumber().trim().isEmpty()) {
            throw new IllegalArgumentException("House number is required");
        }

        if (requestDTO.getStreetName() == null || requestDTO.getStreetName().trim().isEmpty()) {
            throw new IllegalArgumentException("Street name is required");
        }
    }

    private House createHouse(ResidentRequestDTO requestDTO) {
        House house = new House();
        house.setHouseNumber(requestDTO.getHouseNumber());
        house.setStreetName(requestDTO.getStreetName());
        return house;
    }
}
