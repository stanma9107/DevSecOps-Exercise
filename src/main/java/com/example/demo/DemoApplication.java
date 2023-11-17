package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	@Getmapping("/")
	public String hello() {
		return "Hello DevSecOps!"
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
