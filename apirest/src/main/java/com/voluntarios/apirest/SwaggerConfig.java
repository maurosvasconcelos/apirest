package com.voluntarios.apirest;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author mauro
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.voluntarios.apirest"))
				.paths(regex("/api.*"))
				.build()
				.apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {

		ApiInfo apiInfo = new ApiInfo(
				"PROJETO PILOTO SPRING BOOT", 
				"API REST de Cadastro de Voluntários", 
				"1.0", 
				"Terms of Service",
				new Contact("Mauro Vasconcelos",
						"https://github.com/maurosvasconcelos/apirest.git",
						"mauros.vasconcelos@gmail.com"),
				"Apache License Version 2.0", "https://www.apache.org/licesen.html", 
				new ArrayList<VendorExtension>());

		return apiInfo;
	}	


}
