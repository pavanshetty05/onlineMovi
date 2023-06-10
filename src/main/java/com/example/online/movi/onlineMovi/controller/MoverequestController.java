package com.example.online.movi.onlineMovi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.http.HttpEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.online.movi.onlineMovi.module.MovePriceModule;
import com.example.online.movi.onlineMovi.module.MoviRating;
import com.example.online.movi.onlineMovi.module.UserModule;
import com.example.online.movi.onlineMovi.service.MoveRatingService;
import com.example.online.movi.onlineMovi.service.Movepricing;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/movi")
public class MoverequestController {

	@Autowired
	RestTemplate orest;

	@Autowired
	Movepricing pricing;

	@Autowired
	MoveRatingService moverating;

	Logger log = LoggerFactory.getLogger(MoverequestController.class);

	@RequestMapping(value = "/details", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody UserModule addMoveDetails(@RequestBody UserModule ouser) {

		return ouser;

	}

	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public @ResponseBody UserModule getMoveDetails() {
		log.info("Came inside the add");
		UserModule returnOuser = new UserModule();
		returnOuser.setUserName("make");
		returnOuser.setLastName("pavan");
		returnOuser.setUserID(344);
		MoviRating omovRating = moverating.getMoveDetails();
		List<MoviRating> olistMove = new ArrayList<MoviRating>();
		olistMove.add(omovRating);
		MovePriceModule omovepricing = pricing.getMoveDetails();
		List<MovePriceModule> olisMovePrice = new ArrayList<MovePriceModule>();
		olisMovePrice.add(omovepricing);
		returnOuser.setMovePricing(olisMovePrice);
		returnOuser.setMoveRating(olistMove);

		log.info("Came inside the add");
		return returnOuser;
	}

	@RequestMapping(value = "/details", method = RequestMethod.DELETE, consumes = "application/json")
	public @ResponseBody UserModule removeDetails(@RequestBody UserModule ouser) {
		log.info("Came inside the add");
		return ouser;
	}

	@RequestMapping(value = "/details", method = RequestMethod.PUT, consumes = "application/json")
	public @ResponseBody UserModule updateMoveDetails(@RequestBody UserModule ouser) {
		log.info("Came inside the add");
		return ouser;
	}

}
