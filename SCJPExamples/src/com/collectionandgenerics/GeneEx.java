package com.collectionandgenerics;

import java.util.*;

public class GeneEx {

	public static void main(String[] args){
		
		List<Animal> list = new ArrayList<>();
		list.add(new Animal());
		list.add(new Animal());
		addAnimal(list);
		
	}
	
	static void addAnimal(List<? extends Animal> animals){
		
		Animal a = new Animal();
		
	}
}

class Animal {}
class Unicorn extends Animal {}
class Lion extends Unicorn {}
