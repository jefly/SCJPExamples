package com.collection;

import java.util.Comparator;

public class StudentTeacherComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.getTeacher().compareTo(o1.getTeacher());
	}

}
