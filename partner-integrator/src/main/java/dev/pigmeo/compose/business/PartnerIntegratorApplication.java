package dev.pigmeo.compose.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableFeignClients
@SpringBootApplication
@EnableMongoRepositories
public class PartnerIntegratorApplication {
    public static void main(String[] args) {
        SpringApplication.run(PartnerIntegratorApplication.class, args);
    }
}
