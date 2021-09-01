package com.yash.com.yash.Inputoutpuntclassdemo1;
import java.io.*;

public class Ioobject //input output object java
{
	public static void main(String args[])
	{
		try {
			
		
		File f=new File("D:\\demo1.txt");
		System.out.println("file name:"+f.getName()+ "File path:"+f.getPath()+"file Parent"+f.getParent()+"parent file"+f.getParentFile()+"absoult"+f.isAbsolute()+"absolutepath"+f.getAbsolutePath());
		//FileInputStream in=new FileInputStream(f);
		//int i;
		//while((i=in.read())!=-1)
			//System.out.print((char)i);
		
		FileReader r=new FileReader(f);
		//while((i=r.read())!=-1)
		System.out.print((char)r.read());
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

} 
