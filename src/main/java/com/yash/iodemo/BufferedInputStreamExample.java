package com.yash.iodemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

//to read data of file using bufferInput Stream.
public class BufferedInputStreamExample 
{
	public static void main(String args[])
	{ 
		try
		{
		FileInputStream fin=new FileInputStream("demo.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		int i;
		while((i=bin.read())!=-1)
		{
			System.out.println((char)i);
		}
		bin.close();
		fin.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
}
}