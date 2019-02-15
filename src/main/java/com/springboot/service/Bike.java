package com.springboot.service;

import org.springframework.stereotype.Component;

@Component
public class Bike  implements Vehicle{

	@Override
	public String drive() {
		// TODO Auto-generated method stub
		return "Bike is riding...";
	}
	
	

}
