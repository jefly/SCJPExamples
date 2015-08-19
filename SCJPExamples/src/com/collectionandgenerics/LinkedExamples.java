package com.collectionandgenerics;

import java.util.*;

public class LinkedExamples {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("s");
		l.add(4);
		l.add(new Dog());
		l.add('c');
		
		System.out.println(l);
		
		Iterator i = l.descendingIterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		System.out.println(l.element());
		
		
	}
}
class Dog{
	
}
