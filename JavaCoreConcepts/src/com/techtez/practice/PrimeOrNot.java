package com.techtez.practice;

public class PrimeOrNot {

	public static void main(String[] args)
	{
      int num = 7;
      int count =0;
      
      for(int i=1;i<=num;i++)
      {
    	  if(num%i==0)
    	  {
    		  count++;
    	  }
      }
      if(count==2)
      {
    	  System.out.println(num+" is prime");
      }
      else
    	  System.out.println(num+ " is not prime");
	}

}
