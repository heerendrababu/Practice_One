package com.techtez.oops;

// Encapsulation Example:
public class EncapsulationEx 
{

	public static void main(String[] args) 
	{
      Doctor d = new Doctor(1,"Babu",5);
      d.setDname("Heerendra"); // by using setter method we are modifying data.
      System.out.println(d.getDname()); // by using getter method we get data.
	}

}
class Doctor
{
	private int did;
	private String dname;
	private int dexp;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int did, String dname, int i) {
		super();
		this.did = did;
		this.dname = dname;
		this.dexp = i;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getDexp() {
		return dexp;
	}

	public void setDexp(int dexp) {
		this.dexp = dexp;
	}
	
	
	
}