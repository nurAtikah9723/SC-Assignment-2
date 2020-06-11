package net.codejava.SpringBootWebApp.service;

import java.util.Hashtable;
import org.springframework.stereotype.Service;
import net.codejava.SpringBootWebApp.entity.Car;


@Service
public class CarService {
	Hashtable<String, Car> cars = new Hashtable<String, Car>();
	
	public CarService() {
		Car c = new Car();
		c.setBrand("Toyata");
		c.setName("Camry");
		c.setDescription("Available");
		c.setRate(20);
		c.setHour(4);
		c.setCarId(2);
		cars.put("Camry", c);
		
		c = new Car();
		c.setBrand("Honda");
		c.setName("Civic");
		c.setDescription("Non-Available");
		c.setRate(30);
		c.setHour(5);
		c.setCarId(3);
		cars.put("Civic", c);
		
		c = new Car();
		c.setBrand("Nissan");
		c.setName("Almera");
		c.setDescription("Non-Available");
		c.setRate(15);
		c.setHour(9);
		c.setCarId(4);
		cars.put("Almera", c);
		
		c = new Car();
		c.setBrand("Perodua");
		c.setName("Alza");
		c.setDescription("Available");
		c.setRate(20);
		c.setHour(6);
		c.setCarId(5);
		cars.put("Alza", c);
		
		c = new Car();
		c.setBrand("Perodua");
		c.setName("Bezza");
		c.setDescription("Non-Available");
		c.setRate(25);
		c.setHour(5);
		c.setCarId(6);
		cars.put("Bezza", c);
		
		c = new Car();
		c.setBrand("Perodua");
		c.setName("Exora");
		c.setDescription("Available");
		c.setRate(17);
		c.setHour(4);
		c.setCarId(7);
		cars.put("Exora", c);
		
		c = new Car();
		c.setBrand("Perodua");
		c.setName("Myvi");
		c.setDescription("Available");
		c.setRate(10);
		c.setHour(10);
		c.setCarId(8);
		cars.put("Myvi", c);
	}
	
	public Car getCar(String carId) {
		if (cars.containsKey(carId))
			return cars.get(carId);
		else
			return null;
	}
	
	public Hashtable<String, Car> getAll() {
		return cars;
	}

}
