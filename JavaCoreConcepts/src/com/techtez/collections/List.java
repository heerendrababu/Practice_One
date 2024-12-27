package com.techtez.collections;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) 
	{
      ArrayList<Integer> al = new ArrayList<Integer>();
      al.add(1);
      al.add(2);
      al.add(3);
      al.add(4);
      al.add(5);
      System.out.println(al);
      
      System.out.println(al.get(1));
      
      System.out.println(al.size()); // Gives size of an array.
      System.out.println(al.remove(2)); // removes 2nd position element
      System.out.println(al);
      System.out.println(al.isEmpty());
      al.add(1, 4);
      al.add(1,null);
      
      System.out.println(al);
	}
}
