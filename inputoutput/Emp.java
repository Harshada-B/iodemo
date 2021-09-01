package com.yash.com.yash.Inputoutpuntclassdemo1;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable
{
	public int id;
	public String Name;
	public double salary;
	public String designation;
	public String join_date;
	
	//create constractar
	public Emp(int id, String name, double salary, String designation, String join_date) {
		super();
		this.id = id;
		Name = name;
		this.salary = salary;
		this.designation = designation;
		this.join_date = join_date;
	}
	
	
	
	


	

}
