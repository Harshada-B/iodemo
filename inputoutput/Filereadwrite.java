package com.yash.com.yash.Inputoutpuntclassdemo1;
 /**
  * create 2 file which one only read data and another one is write or copy content from 1st file
  */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereadwrite 
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader("readfile.txt");
		
		FileWriter fw=new FileWriter("writefile.txt");
		
		String str="";
		 int i;
		 
		 while((i=fr.read()) != -1)
		 {
			 str +=(char)i;
			 
		 }
		 System.out.println(str);
		 fw.write(str);
		 
		 fr.close();
		 fw.close();
		 
		 System.out.println("writing file is done  see content from file write.txt :");
	}

}
