package com.mani.microservices.productstockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ManiProductStockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManiProductStockServiceApplication.class, args);
	}

}
