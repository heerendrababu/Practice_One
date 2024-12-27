package com.techtez.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample 
{

	public static void main(String[] args)
	{
	  String s = "TechTez";
	  // HashMap stores elements in random order in a key-value form.
      HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
      for(int i=0;i<=s.length()-1;i++)
      {
    	  if(hm.containsKey(s.charAt(i))==true)
    	  {
    		  int val =hm.get(s.charAt(i));
    		  hm.put(s.charAt(i), val+1);
    	  }
    	  else
    		  hm.put(s.charAt(i),1);
      } 
      System.out.println(hm);
	
	
	for(Map.Entry<Character,Integer> entry: hm.entrySet())
	{
		char c = entry.getKey();
		int value = entry.getValue();
		
		System.out.println(c+" is occuring"+value+" times");
	}
	
 }
}
