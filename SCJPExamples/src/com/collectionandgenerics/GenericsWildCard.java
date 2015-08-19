package com.collectionandgenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildCard {
	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		Vehicle c = new Car();
		Vehicle b = new Bus();
		
		List<Vehicle> list = new ArrayList<>();
		list.add(v);
		list.add(c);
		list.add(b);
		
		new GenericsWildCard().addVehicles(list);
	}
	
	void addVehicles(List<? extends Vehicle> vehicleList){
		
		Vehicle car = new Car();
		vehicleList.add(car);	 // Wild card doesn't allow to add to any list. It only allow to retrieve.
	}

}


class Vehicle {}
class Car extends Vehicle{}
class Bus extends Vehicle{}