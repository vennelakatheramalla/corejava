package com.createiq.objectclass;

public class Adress {
	public String city;
	public String state;
	
	public Adress() {
		
	}
	
	public Adress(String city,String state) {
		this.city=city;
		this.state=state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Adress [city=" + city + ", state=" + state + "]";
	}
	
	

}
