package com.yash.com.yash.Inputoutpuntclassdemo1;

import java.io.File;
import java.io.IOException;

public class DeleteDirectory1
{

	public static void deleteDirectory(File file)
	{
		for(File subfile:file.listFiles())
		{
		  if(subfile.isDirectory())
		  {
			  deleteDirectory(subfile);  
		  }
		}
	}
 public static void main(String[] args) throws IOException , NullPointerException
 {
	// File file=new File("D:\\");
	// System.out.println("Directory name in d drive:");
	// String[] files=file.list();
	 
	// for(String string:files)
	// {
	//	 System.out.println(string);
	// }
	 
	 String filepath="D:\\demo1.txt";
	 File file=new File(filepath);
	 deleteDirectory(file);
	 
	 file.delete();
	 
	 
 }
}
