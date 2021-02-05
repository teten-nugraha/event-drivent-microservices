package id.ten.kafka.eventdrivenmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.config.ContextFunctionCatalogAutoConfiguration;

@SpringBootApplication(exclude = ContextFunctionCatalogAutoConfiguration.class)
public class EventDrivenMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventDrivenMicroservicesApplication.class, args);
    }

}
