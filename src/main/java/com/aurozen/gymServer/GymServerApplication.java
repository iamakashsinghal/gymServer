package com.aurozen.gymServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GymServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymServerApplication.class, args);
	}

}
