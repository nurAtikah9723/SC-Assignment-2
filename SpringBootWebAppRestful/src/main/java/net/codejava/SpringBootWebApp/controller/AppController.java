package net.codejava.SpringBootWebApp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.codejava.SpringBootWebApp.entity.Car;
//import net.codejava.SpringBootWebApp.entity.CarList;

@Controller
public class AppController {

	@RequestMapping("/index")
	public String index() {
		System.out.println("AppController->index()");
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/homecustomer")
	public String homecustomer() {
		return "homecustomer";
	}
	
	@RequestMapping("/homeadmin")
	public String homeadmin() {
		return "homeadmin";
	}
	
	@RequestMapping("/manageprofile")
	public String manageprofile() {
		return "manageprofile";
	}
	
	@RequestMapping("/addBooking")
	public String addBooking(Model model) {
			
//		CarList list = new CarList(); // new list constructor 
//		List<Car> car = list.getCarList(); // from CarList.java
//			
//		model.addAttribute("cars",car); // object pointing
//			
		return "addBooking";
	}
	
	@RequestMapping("/addcar")
	public String addcar() {
		return "addcar";
	}
	
	@RequestMapping("/managecar")
	public String managecar() {
		return "managecar";
	}
	
}
