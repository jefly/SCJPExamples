package com.collection;

class C {
	
	void m(){
		System.out.println("super");
	}
	
	void n(){
		m();
	}
}
 public class A extends C{
	
	void m(){
		System.out.println("sub");
	}
	
	void call(){
		super.n();
	}
	
	public static void main(String[] args) {

		new A().call();
		
	}
}

