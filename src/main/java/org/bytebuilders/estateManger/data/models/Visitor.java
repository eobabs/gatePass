package org.bytebuilders.estateManger.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalDateTime;



    @Data
    @Document(collection = "visitors")
    public class Visitor {
        @Id
        private String id;
        private String name;
        private String contactNumber;
        private String otp;
        private LocalDateTime otpGeneratedAt;
//        private VisitorStatus status;

        @DocumentReference
        private Resident host;
}
