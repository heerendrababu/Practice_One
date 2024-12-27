package com.techtez.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) 
	{
      HashSet<String> hs = new HashSet<String>();
      hs.add("Apple");
      hs.add("bat");
      hs.add("cat");
      hs.add(null);
      hs.add("lion");
      // checks set is empty or not if not return false
      System.out.println(hs.isEmpty()); 
      
      // Removes a particular element
      System.out.println(hs.remove("bat"));
      
      // returns true if given element contains
      System.out.println(hs.contains("bat"));
      
      // gives size of set
      System.out.println(hs.size());
      
      // produce duplicate set
      System.out.println(hs.clone());
      // iterate through element & print one by one
      Iterator<String> iterator = hs.iterator();
      while (iterator.hasNext()) {
          System.out.println(iterator.next());
      }

      // it clears set data
      hs.clear();
      System.out.println(hs);
	}

}
