package com.java;

public class flipkart {
	
	private courier courier;

	public courier getCourier() {
		return courier;
	}

	public void setCourier(courier courier) {
		this.courier = courier;
	}
	

	public void purchace(){
		int orderid=5897;
		courier.deliver(orderid);
	}
	
}
