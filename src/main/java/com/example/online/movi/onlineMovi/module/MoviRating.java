package com.example.online.movi.onlineMovi.module;

import java.io.Serializable;

public class MoviRating  implements Serializable{
	
	public String moveID;
	public String moverating;
	
	
	public MoviRating(String moveID, String moverating) {
		super();
		this.moveID = moveID;
		this.moverating = moverating;
	}
	public String getMoveID() {
		return moveID;
	}
	public void setMoveID(String moveID) {
		this.moveID = moveID;
	}
	public String getMoverating() {
		return moverating;
	}
	public void setMoverating(String moverating) {
		this.moverating = moverating;
	}
   
    
    
	
}
