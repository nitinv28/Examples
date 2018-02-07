package com.eta.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StartBoot {

	public static void main(String[] args) {
		SpringApplication.run(StartBoot.class, args);
	}
}
