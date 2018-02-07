package com.eta.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StartElastic {

	public static void main(String[] args) {
		SpringApplication.run(StartElastic.class, args);
	}
}
