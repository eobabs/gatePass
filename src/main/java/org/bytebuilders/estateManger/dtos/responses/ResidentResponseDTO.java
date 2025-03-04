package org.bytebuilders.estateManger.dtos.responses;


import lombok.Data;

@Data
public class ResidentResponseDTO {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String houseId;
}
