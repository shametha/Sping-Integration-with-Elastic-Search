package com.example.demoelastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.annotations.Document;

@SpringBootApplication
public class DemoelasticApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoelasticApplication.class, args);
	}

}
