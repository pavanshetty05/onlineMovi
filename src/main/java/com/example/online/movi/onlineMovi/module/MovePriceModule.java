package com.example.online.movi.onlineMovi.module;

import java.io.Serializable;

public class MovePriceModule implements Serializable{

	public String moveprice;
	public String moveID;
	
	
	public MovePriceModule() {
		super();
	}
	public MovePriceModule(String moveprice, String moveID) {
		super();
		this.moveprice = moveprice;
		this.moveID = moveID;
	}
	public String getMoveprice() {
		return moveprice;
	}
	public void setMoveprice(String moveprice) {
		this.moveprice = moveprice;
	}
	public String getMoveID() {
		return moveID;
	}
	public void setMoveID(String moveID) {
		this.moveID = moveID;
	}
	
	
	
	
	
}
