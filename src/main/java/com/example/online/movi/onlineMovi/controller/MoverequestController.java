package com.example.online.movi.onlineMovi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.online.movi.onlineMovi.module.UserModule;

@RestController
@RequestMapping(value = "/movi")
public class MoverequestController {

	@RequestMapping(value = "/details", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody UserModule addMoveDetails(@RequestBody UserModule ouser) {

		return ouser;
	}

	@RequestMapping(value = "/details", method = RequestMethod.GET, consumes = "application/json")
	public @ResponseBody UserModule getMoveDetails(@PathVariable String userID) {

		UserModule ouserMapping = new UserModule(userID, null, userID, null, null);
		return ouserMapping;
	}

	@RequestMapping(value = "/details", method = RequestMethod.DELETE, consumes = "application/json")
	public @ResponseBody UserModule removeDetails(@RequestBody UserModule ouser) {

		return ouser;
	}

	@RequestMapping(value = "/details", method = RequestMethod.PUT, consumes = "application/json")
	public @ResponseBody UserModule updateMoveDetails(@RequestBody UserModule ouser) {

		return ouser;
	}

}
