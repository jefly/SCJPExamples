package com.collectionandgenerics;

public class Student implements Comparable<Student> {

	private String name;
	private int age;
	private String subject;
	private String teacher;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	public String toString(Object o){
		return name;
		
	}
	@Override
	public int compareTo(Student o) {
		
		return this.getName().compareTo(o.getName());
	}
	
}
