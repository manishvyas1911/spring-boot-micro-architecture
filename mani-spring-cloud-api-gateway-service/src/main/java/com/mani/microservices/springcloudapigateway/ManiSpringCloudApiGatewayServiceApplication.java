package com.mani.microservices.springcloudapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ManiSpringCloudApiGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManiSpringCloudApiGatewayServiceApplication.class, args);
	}

}
