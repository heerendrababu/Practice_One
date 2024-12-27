package com.techtez.oops;

class InheritanceEx {

	public static void main(String[] args) 
	{
       Parent p = new Child();
       p.m();
     //p.m1(); The reason you can't access m1() directly is because m1() is not overridden 
       //in the Parent class. 
       //Only overridden methods are accessible through the parent reference.
	}

}
class Parent
{
	public void m()
	{
		System.out.println("parent method");
	}
}
class Child extends Parent
{
	public void m1()
	{
		m();
		System.out.println("child method");
	}
}
