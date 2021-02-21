package com.mani.microservices.productenquiryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.mani.microservices")
@SpringBootApplication
@EnableEurekaClient
public class ManiProductEnquiryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManiProductEnquiryServiceApplication.class, args);
	}

}
