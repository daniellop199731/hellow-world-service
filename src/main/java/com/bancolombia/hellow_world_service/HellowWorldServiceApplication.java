package com.bancolombia.hellow_world_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HellowWorldServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellowWorldServiceApplication.class, args);
	}

}
