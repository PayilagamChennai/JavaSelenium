package com.payilagam.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		
		
		al.add(123); 
		al.add(234); 
		al.add(345); 
		Iterator i = al.iterator(); 
		while(i.hasNext())
		{
			i.remove();
		}
		

	}

}
