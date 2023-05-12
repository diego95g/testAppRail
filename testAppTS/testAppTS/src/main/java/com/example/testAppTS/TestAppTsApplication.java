package com.example.testAppTS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class TestAppTsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAppTsApplication.class, args);
	}

}
