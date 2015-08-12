package com.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Sorting {

	public static void main(String[] args) {
		
		HashMap props = new HashMap();
//		props.put(3, "some value");
		props.put("a", "some other value");
		props.put(1, "yet another value");
		Set s = props.keySet();
		
		s = new TreeSet(s);
		
		System.out.println(s);
	}
}
