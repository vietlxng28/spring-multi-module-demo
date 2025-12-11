package com.vietlong.sandbox.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(name = "io.swagger.v3.oas.models.OpenAPI")
public class SwaggerConfig {

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("Microservices API Documentation")
            .version("1.0")
            .description("Unified API Documentation for all microservices - User Service, Product Service, Order Service, and Common Service")
            .contact(new Contact()
                .name("VietLong")
                .email("vtlong@example.com")));
  }

}
