package dev.pigmeo.compose.business.controller;

import dev.pigmeo.compose.business.service.PartnerIntegratorService;
import dev.pigmeo.compose.common.model.Entity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/partner-integration")
public class PartnerIntegratorController {

    private final PartnerIntegratorService partnerIntegratorService;

    @PostMapping
    public ResponseEntity<Entity> getPartnerInformation(@RequestBody Entity entity){
        return ResponseEntity.ok(partnerIntegratorService.getPartnerInformation(entity));
    }
}
