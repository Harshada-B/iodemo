package com.yash.com.yash.Inputoutpuntclassdemo1;

import java.io.*;





public class SudentSerialazible
{
	public static void main(String args[]) throws IOException ,ClassNotFoundException
	{
		
	   try {
		   
	   
	    		  
	    	 
	     
		Student s=new Student(1,"Maxx",70);
		FileOutputStream fos=new FileOutputStream("Stud.txt");
		ObjectOutputStream out=new ObjectOutputStream(fos);
		out.writeObject(s);
		out.flush();
		System.out.println("serilazation is done");
		
		
		
		FileInputStream fin=new FileInputStream("stud.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		Student s1=(Student)ois.readObject();
		System.out.println(s1.id+" "+s1.name+" "+s1.marks);
		fin.close();
		out.close();
	    fos.close();
	    ois.close();
		
		
	}
	catch(EOFException e)
	{
		System.out.println(e);
	}
	
		
		}

}
