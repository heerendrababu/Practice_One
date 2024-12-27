package com.techtez.oops;

// constructor is used to initialize objects.
//if the data is common for multiple persons at the time we use Constructor.
public class ConstructorEx 
{ 
	public static void main(String[] args) 
	{
       Student s = new Student(1,"Shubham");
       s.display();
       Student s1 = new Student(2,"Rajesh");
       s1.display();
	}

}
class Student
{
	int sid;
	String sname;
	
	public Student(int sid,String sname)
	{
		this.sid = sid;
		this.sname = sname;
	}
	
	public void display()
	{
		System.out.println(this.sid);
		System.out.println(this.sname);
	}
}