package com.itana.personalproject.configuration;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfiguration {
    @Bean(name = "api")
    public OpenAPI datasetOpenApi() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("API developed of Graduates From University First Degree Courses By Type Of Course")
                        .description("API implemented with Spring Boot RESTFul service and documented using springdoc-openapi and OpenAPI 3.0" +
                                ". For more information about the dataset go to: " +
                                "https://data.gov.sg/dataset/graduates-from-university-first-degree-courses-by-type-of-course?view_id=fa0e401c-6251-4a15-aebc-a5f3d2c85752&resource_id=eb8b932c-503c-41e7-b513-114cffbe2338"));

    }
}