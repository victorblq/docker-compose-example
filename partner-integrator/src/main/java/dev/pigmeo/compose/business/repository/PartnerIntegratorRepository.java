package dev.pigmeo.compose.business.repository;

import dev.pigmeo.compose.common.model.Entity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartnerIntegratorRepository extends MongoRepository<Entity, String> {
}
