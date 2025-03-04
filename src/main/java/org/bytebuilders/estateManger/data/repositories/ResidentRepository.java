package org.bytebuilders.estateManger.data.repositories;

import org.bytebuilders.estateManger.data.models.Resident;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResidentRepository extends MongoRepository<Resident, String> {

}
