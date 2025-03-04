package org.bytebuilders.estateManger.data.repositories;

import org.bytebuilders.estateManger.data.models.House;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HouseRepository extends MongoRepository<House, String> {
}
