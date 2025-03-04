package org.bytebuilders.estateManger.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
@Document(collection = "residents")
public class Resident {

    @Id
    private String id;
    private String name;

    @DocumentReference
    private House house;

}
