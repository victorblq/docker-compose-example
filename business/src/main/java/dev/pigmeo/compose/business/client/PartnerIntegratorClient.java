package dev.pigmeo.compose.business.client;

import dev.pigmeo.compose.common.model.Entity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "partnerIntegratorClient", url = "http://partner-integrator.pigmeo.dev:8090/")
public interface PartnerIntegratorClient {

    @PostMapping("/partner-integration")
    Entity getPartnerInformation(Entity entity);
}
