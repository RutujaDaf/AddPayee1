package com.wipro.onlinebanking;

import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Addpayee")
public class Addpayee {
	private long accno;
	private String name;
	
	public long getaccno() {
		return accno;
	}
	public void setNum(long num) {
		this.accno = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
