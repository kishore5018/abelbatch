package com.java;

public class car {

	private String carname;
	private engine engine;
	public car(String carname,engine engine){
		
		this.carname=carname;
		this.engine=engine;
		
	}
	public void display(){
		System.out.println(carname);
		engine.show();
	}
	
	
	
	
}
