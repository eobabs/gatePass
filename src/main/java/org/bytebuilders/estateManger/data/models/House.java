package org.bytebuilders.estateManger.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
@NoArgsConstructor

public class House {

    @Id
    private String id;
    private String houseNumber;
    private String streetName;

    @DocumentReference
    private Resident currentResident;


}
