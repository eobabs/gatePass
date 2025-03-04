package org.bytebuilders.estateManger.utils;

import org.bytebuilders.estateManger.data.models.Resident;
import org.bytebuilders.estateManger.dtos.requests.ResidentRequestDTO;
import org.bytebuilders.estateManger.dtos.responses.ResidentResponseDTO;
import org.springframework.web.bind.annotation.Mapping;

@Mapper(componentModel = "spring")
public interface Mappers {
    EntityDTOMapper INSTANCE = Mappers.getMapper(EntityDTOMapper.class);

    @Mapping(source = "house.id", target = "houseId")
    ResidentResponseDTO toResidentResponseDTO(Resident resident);

    @Mapping(target = "house", ignore = true)
    Resident toResident(ResidentRequestDTO requestDTO);
}