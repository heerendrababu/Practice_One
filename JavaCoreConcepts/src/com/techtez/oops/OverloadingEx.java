package com.techtez.oops;

public class OverloadingEx {

	public static void main(String[] args) 
	{
       Person p = new Person("Kishore");
       p.appear();
       p.appear("Hi");
       System.out.println(p.pname);
	}

}
// Entity is appearing with same name and different parameters in a given class.
class Person
{
  String pname;
  public Person(String pname)
  {
	  this.pname = pname;
  }
  public void appear()
  {
	System.out.println("A person appears as a father to childern");
  }
  public void appear(String s)
  {
	  System.out.println("A person appears as a husband to his wife");
  }
}