package com.java.main.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Test");
		list1.add("Test1");
		list1.add("Test2");
		list1.add("Test3");
		list1.add("Test4");
		list1.add("Test5");
		list1.add("Test6");
		
		
		
		list1.set(4, "added Test");
		
		if(list1.contains("Test1")) {
			System.out.println("contains Test1" + list1.indexOf("Test6"));
			System.out.println("Removed" + list1.remove(5));
		}
		
		System.out.println(list1);
		
		for(int i=0;i<=list1.size()-1; i++) {
			 System.out.println("in loop"+list1.get(i));
		}
		
		for(String str : list1) {
			System.out.println("enhancd for" + str);
		}
		
		Iterator<String> itr = list1.iterator();
		itr.next();
		System.out.println(itr.next());
		
	}
	

}
