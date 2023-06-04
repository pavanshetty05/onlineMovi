package com.example.online.movi.onlineMovi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OnlineMoviApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OnlineMoviApplication.class, args);
	}

}
