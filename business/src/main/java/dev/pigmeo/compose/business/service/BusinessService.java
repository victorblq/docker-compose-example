package dev.pigmeo.compose.business.service;

import dev.pigmeo.compose.business.client.PartnerIntegratorClient;
import dev.pigmeo.compose.business.repository.BusinessRepository;
import dev.pigmeo.compose.common.model.Entity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class BusinessService {

    private final BusinessRepository businessRepository;
    private final PartnerIntegratorClient partnerIntegratorClient;

    public Entity getPartnerInformation(){
        String operationId = UUID.randomUUID().toString();
        log.info("Starting operation with operationId: {}", operationId);

        Entity entity = businessRepository.save(new Entity(null, operationId, null));
        Entity partnerResponse = partnerIntegratorClient.getPartnerInformation(entity);

        return businessRepository.save(partnerResponse);
    }
}
