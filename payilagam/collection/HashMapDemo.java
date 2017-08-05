package com.payilagam.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdentityHashMap hm = new IdentityHashMap(); 
		Integer i1 = new Integer(101); 
		Integer i2 = new Integer(102); 
		Integer i3 = new Integer(103); 
	//	System.out.println(hm.size()); 
		hm.put(i1, "GUhan"); 
		hm.put(i2, "Sindhu"); 
		hm.put(i3, "Keerthi"); 
	//	System.out.println(hm.size()); 
//	System.out.println(hm);
	//	System.out.println(hm.keySet()); 
	//	System.out.println(hm.entrySet()); 
		Set s1 = hm.entrySet(); 
		
		Iterator i = s1.iterator(); 
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next(); 
			System.out.println("Key is " + me.getKey() + " and value is "+ me.getValue()); 
			if(me.getKey().equals(i1))
			{
				me.setValue("Manikandan"); 
			}
			System.out.println(me);
			
		}
		

	}

}
