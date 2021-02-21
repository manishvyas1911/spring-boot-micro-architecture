package com.mani.microservices.manispringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ManiSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManiSpringCloudConfigServerApplication.class, args);
	}

}
