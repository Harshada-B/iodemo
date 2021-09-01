package com.yash.com.yash.Inputoutpuntclassdemo1;

import java.io.File;
import java.io.IOException;

public class Directoryname 
{
	
 public static void main(String[] args) throws IOException , NullPointerException
 {
	 File file=new File("D:\\");
	 System.out.println("Directory name in d drive:");
	String[] files=file.list();
	 
	 for(String string:files)
	 {
		 System.out.println(string);
	 }
	 
	 
	 
	 
 }
}
