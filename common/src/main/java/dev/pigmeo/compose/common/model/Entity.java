package dev.pigmeo.compose.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
public class Entity {
    @Id
    @Getter
    private String id;
    @Getter
    private String operationId;
    @Getter
    private String partnerResponse;
}
