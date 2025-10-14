package com.meli.orders.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * OpenAPI (Swagger) configuration.
 */
@Configuration
public class OpenApiConfig {


    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("MELI Orders API")
                        .version("v0.0.1")
                        .description("API for creating and managing orders"));
    }
}