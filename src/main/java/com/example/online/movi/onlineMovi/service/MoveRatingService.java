package com.example.online.movi.onlineMovi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.online.movi.onlineMovi.module.MoviRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class MoveRatingService {

	Logger log = LoggerFactory.getLogger(MoveRatingService.class);

	@Autowired
	RestTemplate orest;

	@HystrixCommand(fallbackMethod = "fallBackMethod",commandProperties = {
	       // @HystrixProperty (name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000"),
	        @HystrixProperty (name = "circuitBreaker.requestVolumeThreshold", value = "3"),
	        @HystrixProperty (name = "circuitBreaker.sleepWindowInMilliseconds", value = "50"),
	        @HystrixProperty (name = "circuitBreaker.errorThresholdPercentage", value = "2")
		}
	 )
	public MoviRating getMoveDetails() {
		MoviRating omovRating = orest.getForObject("http://localhost:8082/movi/rating", MoviRating.class);
		return omovRating;
	}

	public MoviRating fallBackMethod() {
		MoviRating omove = new MoviRating();
		omove.setMoveID("0");
		omove.setMoverating("0");
		return omove;
	}

}
