package com.collectionandgenerics;

import java.util.*;
import java.util.Collections;

public class StudentDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setAge(29);
		s1.setName("amal");
		s1.setSubject("maths");
		s1.setTeacher("Kapila");
		
		Student s2 = new Student();
		s2.setAge(25);
		s2.setName("ranga");
		s2.setSubject("art");
		s2.setTeacher("Maxi");
		
		Student s3 = new Student();
		s3.setAge(32);
		s3.setName("kushan");
		s3.setSubject("music");
		s3.setTeacher("Mercien");
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Iterator<Student> it = list.iterator();
		
		Collections.sort(list);
		
		it = list.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.print(", by name "+s.getName());
		}
	}

}
