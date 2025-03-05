package org.bytebuilders.estateManger.utils;

import org.bytebuilders.estateManger.data.models.Resident;
import org.bytebuilders.estateManger.dtos.requests.ResidentRequestDTO;
import org.bytebuilders.estateManger.dtos.responses.ResidentResponseDTO;
import org.springframework.web.bind.annotation.Mapping;


public class Mappers {


    public static ResidentRequestDTO mapToDTO(Resident resident) {
        ResidentRequestDTO dto = new ResidentRequestDTO();
        dto.setId(resident.getId());
        dto.setName(resident.getName());
        return dto;
    }

    public static Resident mapToEntity(ResidentRequestDTO dto) {
        Resident entity = new Resident();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }

}