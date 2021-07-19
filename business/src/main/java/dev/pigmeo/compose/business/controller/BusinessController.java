package dev.pigmeo.compose.business.controller;

import dev.pigmeo.compose.business.service.BusinessService;
import dev.pigmeo.compose.common.model.Entity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/business")
public class BusinessController {

    private final BusinessService businessService;

    @GetMapping
    public ResponseEntity<Entity> getPartnerInformation(){
        return ResponseEntity.ok(businessService.getPartnerInformation());
    }
}
