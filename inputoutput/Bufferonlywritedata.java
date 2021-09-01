package com.yash.com.yash.Inputoutpuntclassdemo1;

import java.io.*;
/**
 * Create new File for writing using Bufferwrite 
 */

public class Bufferonlywritedata 
{
	public static void main(String args[]) throws  IOException
	{
	    File f=new File("file1.txt");
	     try( 
	    	 FileInputStream fis=new FileInputStream("demo.txt");
	     
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream(f);
		BufferedOutputStream bos=new BufferedOutputStream(fos);)
	     {
	    	 String s="welcome to Buffer World,welcome in java,java programming is like sea";
	    	 byte b[]=s.getBytes();
	    	 bos.write(b);
	    	 
	    	 int x=0;
	    	 while((x=bis.read())!=-1)
	    		 System.out.println((char)x);
	    	 bos.flush();
	    	 
	     }
	     catch(Exception e)
	     {
	    	 System.out.println(e);
	     }
	}

}
