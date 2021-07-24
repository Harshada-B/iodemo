package com.yash.iodemo;

import java.io.File;
import java.io.FileInputStream;

public class FileDemo1 
{
	public static void main(String args[])
	{
	try
	{
	File fp=new File("demo.text");
	System.out.println("filename"+fp.getName());
	FileInputStream in=new FileInputStream(fp);
	int i;
	while((i=in.read())!=-1)
		System.out.println((char)i);
	}
	catch(Exception e)
	{
		System.out.println("FileNotFoundException:"+e);
	}
	}
}
