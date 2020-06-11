package net.codejava.SpringBootWebApp.controller;

import java.util.Hashtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.codejava.SpringBootWebApp.service.CarService;
import net.codejava.SpringBootWebApp.entity.Car;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	@Autowired
	CarService cs;
	
	@RequestMapping("/all")
	public Hashtable<String, Car> getAll() {
		return cs.getAll();
	}
	
	@RequestMapping("{id}")
	public Car getUser(@PathVariable("id") String carId) {
		return cs.getCar(carId);
	}
	
}
