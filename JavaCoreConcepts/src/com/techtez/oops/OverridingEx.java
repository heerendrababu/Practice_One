package com.techtez.oops;

public class OverridingEx 
{

	public static void main(String[] args)
	{
       Employee ne = new NewEmployee();
       ne.details();
	}

}
class Employee
{
	public void details()
	{
		int eid =1;
		String ename = "Ramu";
		
		System.out.println(eid);
		System.out.println(ename);
	}
}
class NewEmployee extends Employee
{
	
	public void details()
	{
		//super.details(); if i want to print parent details too we can use super
		int eid = 2;
		String ename = "Somu";
		System.out.println(eid);
		System.out.println(ename);
	}
}
