package org.bytebuilders.estateManger.data.repositories;

import org.bytebuilders.estateManger.data.models.SecurityOffice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SecurityOfficeRepository extends MongoRepository<SecurityOffice, String> {
}
