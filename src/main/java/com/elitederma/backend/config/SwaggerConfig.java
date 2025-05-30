package com.elitederma.backend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Mensajes - FemTech")
                        .description("Documentación interactiva de la API de Mensajes de FemTech")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("FemTech")
                                .email("soporte@femtech.com")));
    }
}
