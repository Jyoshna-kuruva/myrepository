package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// use appropriate annotation to scan all the packages
@ComponentScan("com.*")
public class PaintingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaintingServiceApplication.class, args);
	}

}
