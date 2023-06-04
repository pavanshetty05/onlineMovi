package com.example.online.movi.onlineMovi.module;

import java.io.Serializable;
import java.util.*;

public class UserModule implements Serializable{

	public String userName;
	public Integer userID;
	public String lastName;

	List<MoviRating> moveRating = new ArrayList<MoviRating>();
	
	List<MovePriceModule> movePricing = new ArrayList<MovePriceModule>();
	
	

	public UserModule(String userName, Integer userID, String lastName, List<MoviRating> moveRating,
			List<MovePriceModule> movePricing) {
		super();
		this.userName = userName;
		this.userID = userID;
		this.lastName = lastName;
		this.moveRating = moveRating;
		this.movePricing = movePricing;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<MoviRating> getMoveRating() {
		return moveRating;
	}

	public void setMoveRating(List<MoviRating> moveRating) {
		this.moveRating = moveRating;
	}

	public List<MovePriceModule> getMovePricing() {
		return movePricing;
	}

	public void setMovePricing(List<MovePriceModule> movePricing) {
		this.movePricing = movePricing;
	}
	
	

	

}
