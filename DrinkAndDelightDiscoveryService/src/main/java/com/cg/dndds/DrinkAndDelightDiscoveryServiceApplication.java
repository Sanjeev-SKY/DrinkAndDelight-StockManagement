package com.cg.dndds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DrinkAndDelightDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrinkAndDelightDiscoveryServiceApplication.class, args);
	}

}
