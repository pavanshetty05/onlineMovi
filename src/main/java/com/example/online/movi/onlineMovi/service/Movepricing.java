package com.example.online.movi.onlineMovi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.online.movi.onlineMovi.module.MovePriceModule;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class Movepricing {

	Logger log = LoggerFactory.getLogger(Movepricing.class);

	@Autowired
	RestTemplate orest;

	@HystrixCommand(fallbackMethod = "fallBackMethod")
	public MovePriceModule getMoveDetails() {

		MovePriceModule omovepricing = orest.getForObject("http://localhost:8081/movi/price", MovePriceModule.class);
		return omovepricing;
	}
	
	public MovePriceModule fallBackMethod()
	{
		MovePriceModule omove=new MovePriceModule();
		omove.setMoveID("0");
		omove.setMoveprice("0");
		return omove;
	}
	

}
