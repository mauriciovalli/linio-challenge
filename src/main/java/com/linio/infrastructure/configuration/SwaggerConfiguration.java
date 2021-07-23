/*
 * (C) Copyright  2011/2021 MVALLI.  All Rights Reserved
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF MVALLI.
 * The copyright notice above does not evidence any actual or intended
 * publication of such source code.
 */

package com.linio.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {

    public static final Contact SUPPORTED_CONTACTS = new Contact("Mauricio Valli", "http://www.bpmx.com.ar",
            "mauricio.valli@gmail.com");

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("BPM Services")
                .description("BPM ServiceWith Swagger Documentation")
                .contact(SUPPORTED_CONTACTS)
                .license("BPM Services Licence Version 1.0")
                .version("1.0")
                .build();
    }

    @Bean
    public Docket newApi() {
        final Set<String> produce = new HashSet<>(Arrays.asList("application/json", "application/xml"));
        final Set<String> consume = new HashSet<>(Arrays.asList("application/json", "application/xml"));
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .produces(produce)
                .consumes(consume);
    }
}
