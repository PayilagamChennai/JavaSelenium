package com.payilagam.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hs = new LinkedHashSet(); 
		hs.add(100); 
		hs.add(110); 
		hs.add(120); 
		hs.add(130); 
		System.out.println(hs);
		System.out.println(hs.contains(130)); 
		hs.remove(110); 
		System.out.println(hs);
		

	}

}
