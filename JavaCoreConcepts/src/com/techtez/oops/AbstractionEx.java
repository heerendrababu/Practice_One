package com.techtez.oops;

public class AbstractionEx 
{

	public static void main(String[] args) 
	{
      Kite k = new Kite();
      k.fly();
      
      Aeroplane a = new Aeroplane();
      a.fly();
	}

}
// Hiding implementation details by using interface
interface Fly
{
	public abstract void fly();
}
class Aeroplane implements Fly
{
	public void fly()
	{
		System.out.println("Aeroplane can fly");
	}
}
class Kite implements Fly
{
	public void fly()
	{
		System.out.println("Kite can fly");
	}
}
