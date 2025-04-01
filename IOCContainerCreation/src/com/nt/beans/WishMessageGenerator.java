package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date; //defining predefined class member as private
	
	public void setDate(Date date) {
		this.date=date;	// accessing private member using setter method
	}
	
	// business methods 
	public String generateMessage(String name){
		int hour =0;
		hour = date.getHours();
		if(hour <=12) 
			return "Good morning "+name;
		else if(hour<16)
			return "Good afternoon "+name;
		else if(hour<20)
			return "Good evening "+name;
		else
			return "Good night "+name;
	}

}
