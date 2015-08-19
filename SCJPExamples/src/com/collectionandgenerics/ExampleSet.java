package com.collectionandgenerics;

import java.util.*;

public class ExampleSet {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add(40);
		a.add(85);
//		a.add("A");
		Iterator it = a.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			System.out.print(i + " ");
		}
	}
}

class K {
	int a;

	K(int i) {
		this.a = i;
	}

	public String toString() {
		return Integer.toString(a);
	}
}