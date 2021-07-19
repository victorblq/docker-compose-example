package dev.pigmeo.compose.business.repository;

import dev.pigmeo.compose.common.model.Entity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends MongoRepository<Entity, String> {
}
