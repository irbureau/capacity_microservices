package com.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserServiceApplication {
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to CI/CD of Jenkins";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "Hello I'm Akshay singh";
	}

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
