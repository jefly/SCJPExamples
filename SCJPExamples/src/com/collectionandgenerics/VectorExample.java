package com.collectionandgenerics;

import java.util.*;

public class VectorExample {
	
	public static void main(String[] args) {
		
		HashSet s = new HashSet();
		s.add("saman");
		s.add("kamal");
		s.add("namal");
		s.add("amal");
		
		System.out.println(s);
		s.remove("amal");
		System.out.println(s);
		
		System.out.println(s.contains("kamal"));
	}

}
