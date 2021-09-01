package com.yash.com.yash.Inputoutpuntclassdemo1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfilefolder 
{
   public static void main(String[] args) throws IOException
   {
	   FileReader f1=new FileReader("D:\\Company\\basicInfo.txt");
	  
	   int i;
	   String str="";
	   while((i=f1.read()) !=-1)
	   {
		   str +=(char)i;
		   
	   }
	   System.out.println(str);
	   f1.close();
	   
   }
}
