package com.collection;

import java.util.ArrayList;
import java.util.List;



public class Lists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List list = new ArrayList();
		
		char[] charArray = {'c', 'a',  'd', 'f', 'b', 'g', 'e'};
		
		for(char c : charArray){
			list.add(c);
		}
		
		System.out.println(list);
		
		list.add('h');

		System.out.println(list);
		
		list.add(7, 'i');
		
		list.add(7, 'i');
		
		System.out.println(list.contains('i'));
		
		list.add(null);
		
		System.out.println(list);
		
		list.add(null);
		
		System.out.println(list);
		
		System.out.println(list.contains(null));
		
		List liist = new ArrayList();

		for(int i = 1; i < 21; i++){
			liist.add(i);
		}
		
		System.out.println(liist.size());
		
		Object o = list.get(3);
		
		
		
		System.out.println(((Character)o).charValue());
	}

}
