package com.abc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ABCApplication {

	public static void main(String[] args) {
		SpringApplication.run(ABCApplication.class, args);
		System.out.println("Starting app..");
	}	
}
