package com.yash.com.yash.Inputoutpuntclassdemo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Serialemp 
{
   public static <emp> void printdata(Emp ob1)
   {
	   System.out.println("id ="+ob1.id);
	   System.out.println("name ="+ob1.Name);
	   System.out.println("salary ="+ob1.salary);
	   System.out.println("designation ="+ob1.designation);
	   System.out.println("Date ="+ob1.join_date);
   }  
   public static void main(String[] args)
   {
	   Emp ob=new  Emp(1,"usha",30000.00,"trinee","5-07-2o21");
	   String filename="temp";
	   try {
		   FileOutputStream file=new FileOutputStream(filename);
		   ObjectOutputStream out=new ObjectOutputStream(file);
		   
		   out.writeObject(ob);
		   out.close();
		   file.close();
		   System.out.println("object has serilizable");
		   printdata(ob);
		   
		   
	   }
	   catch(Exception e)
	   {
		  System.out.println(e); 
	   }
	   try {
		   
           
           FileInputStream file = new FileInputStream(filename);
           ObjectInputStream in = new ObjectInputStream(file);
 
           
           ob= (Emp)in.readObject();
 
           in.close();
           file.close();
           System.out.println("Object has been deserialized\n"
                               + "Data after Deserialization.");
           printdata(ob);
 
           
       }
 
       catch (IOException ex) {
           System.out.println("IOException is caught");
       }
 
       catch (ClassNotFoundException ex) {
           System.out.println("ClassNotFoundException" +
                               " is caught");
			   
		   
			   
   }
	   }
}


