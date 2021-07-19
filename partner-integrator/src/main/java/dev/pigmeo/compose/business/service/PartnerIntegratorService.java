package dev.pigmeo.compose.business.service;

import dev.pigmeo.compose.business.repository.PartnerIntegratorRepository;
import dev.pigmeo.compose.common.model.Entity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class PartnerIntegratorService {

    private final PartnerIntegratorRepository partnerIntegratorRepository;

    public Entity getPartnerInformation(Entity entity){
        log.info("Getting partner information with operationId: {}", entity.getOperationId());
        String partnerResponse = UUID.randomUUID().toString();
        Entity partnerResponseEntity = new Entity(entity.getId(), entity.getOperationId(), partnerResponse);

        return partnerIntegratorRepository.save(partnerResponseEntity);
    }
}
