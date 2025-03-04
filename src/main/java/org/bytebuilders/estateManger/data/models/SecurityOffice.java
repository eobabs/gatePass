package org.bytebuilders.estateManger.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "security_post")
public class SecurityOffice {
    @Id
    private String id;
    private String location;
    private int currentVisitorCount;
    private int maxCapacity;
}
