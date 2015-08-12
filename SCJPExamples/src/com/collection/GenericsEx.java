package com.collection;

import java.util.*;

public class GenericsEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("supun");
		list.add("namal");
		list.add("lakmanl");
		checkList(list);

	}
	
	static void checkList(List l){
		
		Iterator i = l.iterator();
		while(i.hasNext()){
			String s = (String) i.next();
			System.out.println(s);
		}
	}

}
