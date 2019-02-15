package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.Bike;
import com.springboot.service.Car;

@RestController
public class VehicleController {
	@Autowired
	Car car;
	@Autowired
	Bike bike;
	
	@GetMapping("/car")
	public String getCar() {
		
		
		return car.drive();
	}
	
	@GetMapping("/bike")
	public String getBike() {
		
		return bike.drive();
	}

}
