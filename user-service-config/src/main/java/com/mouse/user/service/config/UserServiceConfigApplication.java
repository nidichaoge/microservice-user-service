package com.mouse.user.service.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.mouse.user.service"})
public class UserServiceConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceConfigApplication.class, args);
	}

}
