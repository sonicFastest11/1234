package com.collection.interfacedemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
	public static void main(String[] args) {
	      // ArrayList 
	      List<String> a1 = new ArrayList<String>();
	      a1.add("Zara");
	      a1.add("Mahnaz");
	      a1.add("Ayan");
	      System.out.println(" ArrayList Elements");
	      System.out.print("\t" + a1);

	      // LinkedList
	      List<String> l1 = new LinkedList<String>();
	      l1.add("Zara");
	      l1.add("Mahnaz");
	      l1.add("Ayan");
	      System.out.println();
	      System.out.println(" LinkedList Elements");
	      System.out.print("\t" + l1);

	      // HashSet
	      Set<String> s1 = new HashSet<String>(); 
	      s1.add("Zara");
	      s1.add("Mahnaz");
	      s1.add("Ayan");
	      System.out.println();
	      System.out.println(" Set Elements");
	      System.out.print("\t" + s1);

	      // HashMap
	      Map<String, Integer> m1 = new HashMap<String, Integer>(); 
	      m1.put("Zara", 8);
	      m1.put("Mahnaz", 31);
	      m1.put("Ayan", 12);
	      m1.put("Daisy", 14);
	      System.out.println();
	      System.out.println(" Map Elements");
	      System.out.print("\t" + m1);
	   }
}
