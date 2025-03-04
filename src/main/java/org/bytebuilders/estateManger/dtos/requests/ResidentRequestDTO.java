package org.bytebuilders.estateManger.dtos.requests;


import lombok.Data;

@Data
public class ResidentRequestDTO {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String houseNumber;
    private String streetName;
}
