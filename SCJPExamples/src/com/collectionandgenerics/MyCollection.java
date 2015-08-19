package com.collectionandgenerics;

import java.util.*;

class MyCollection {

	private int iLookUp;

	public MyCollection(int iLookUP, String sValue) {
		this.iLookUp = iLookUp;
	}

	public void setLookUp(int iLookUp) {
		this.iLookUp = iLookUp;
	}

	public int getLookUp() {
		return iLookUp;
	}

	public boolean equals(Object o) {
		Integer iwLookUp = (Integer) o;
		if (iLookUp == iwLookUp.intValue()) {
			return true;
		}
		return false;
	}

	public int compareTo(Object o) {
		MyCollection vp = (MyCollection) o;
		Integer iwLookUp = new Integer(vp.getLookUp());
		if (iwLookUp.intValue() < iLookUp) {
			return -1;
		}
		if (iwLookUp.intValue() > iLookUp) {
			return +1;
		}
		return 0;
	}

	public static void main(String[] args) {


	}
}
