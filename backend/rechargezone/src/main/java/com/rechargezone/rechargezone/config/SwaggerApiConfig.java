
package com.rechargezone.rechargezone.config;

// import org.hibernate.mapping.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import static io.swagger.v3.oas.models.security.SecurityScheme.Type.HTTP;

import java.util.List;

@Configuration
public class SwaggerApiConfig {

        @Bean
        public OpenAPI openAPI() {
            return new OpenAPI()
                    .servers(List.of(new Server().url("http://localhost:8080")))
                    .addSecurityItem(new SecurityRequirement()
                            .addList("bearerAuth"))
                    .components(new Components()
                            .addSecuritySchemes(
                                    "bearerAuth", new SecurityScheme()
                                            .name("bearerAuth")
                                            .type(HTTP)
                                            .scheme("bearer")
                                            .description("Provide the JWT token")
                                            .bearerFormat("JWT")));
        }
    
}
