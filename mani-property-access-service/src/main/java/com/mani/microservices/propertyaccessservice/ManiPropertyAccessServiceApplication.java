package com.mani.microservices.propertyaccessservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ManiPropertyAccessServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManiPropertyAccessServiceApplication.class, args);
	}
//	@Autowired
//    public void setEnv(Environment e)
//    {
//        System.out.println(e.getProperty("property-file.name"));
//    }

}
