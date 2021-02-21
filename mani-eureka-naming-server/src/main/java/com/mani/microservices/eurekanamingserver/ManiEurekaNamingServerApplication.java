package com.mani.microservices.eurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ManiEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManiEurekaNamingServerApplication.class, args);
	}

}
