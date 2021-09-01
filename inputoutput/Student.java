package com.yash.com.yash.Inputoutpuntclassdemo1;

import java.io.*;


public class Student implements Serializable
{
        int id;
		String name;
         int marks;
		 
		
		public Student(int id,String name,int marks)//constractor with parameter is non-abstract Constractor
		{
			super();
			this.id=id;
			this.name=name;
			this.marks=marks;
			
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
		}
		
		
			
		
	}


