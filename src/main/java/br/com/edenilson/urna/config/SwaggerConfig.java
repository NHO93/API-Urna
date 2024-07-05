package br.com.edenilson.urna.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Urna Eletrônica API")
                        .description("API para gerenciar candidatos e votos em uma urna eletrônica")
                        .version("v1.0.0")
                        .contact(new Contact().name("Edenilson Fabiano").email("edenilsonsouza.bsi@gmail.com").url("https://github.com/NHO93"))
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
               .externalDocs(new ExternalDocumentation()
                        .description("Documentação Completa")
                       .url("")); // seu site aqui
    }
}