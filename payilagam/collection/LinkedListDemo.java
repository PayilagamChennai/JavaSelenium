package com.payilagam.collection;

import java.util.LinkedList;

class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList(); 
		
		ll.add("Guhan"); 
		ll.add("Muthu"); 
		ll.add("Keerthi"); 
		ll.add("Sindhu"); 
		
		LinkedList ll2 = new LinkedList(); 
		System.out.println("ll2 before "+ll2);
		ll2.addAll(ll); 
		System.out.println("ll2 after "+ll2);
		System.out.println("ll2 after size "+ll2.size());
		System.out.println("ll2 after "+ll2.removeLast());
		System.out.println("ll2 after removeLast "+ll2);
		System.out.println("ll2 after getFirst "+ll2.getFirst());
		System.out.println(ll2.get(2));
	}

}
