package com.springboot.service;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	@Override
	public String drive() {
		// TODO Auto-generated method stub
		
		return "Car is driving...";
		
	}

}
