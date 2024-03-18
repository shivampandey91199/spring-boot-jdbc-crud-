package com;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class SpringBootJdbcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcDemoApplication.class, args);
	}

//	@Bean
//	public Docket myApi() {
//		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com")).build()
//				.apiInfo(apiInfo());
//
//	}
//
//	private ApiInfo apiInfo() {
//		@SuppressWarnings("deprecation")
//		ApiInfo ap = new ApiInfo("21-spring-tue-sat-sun", "dummy rest api", "1", "www.tos.com", "Tejas Shah",
//				"Apache 2.0", "www.apache.com");
//		return ap;
//	}

}
