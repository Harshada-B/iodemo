package com.yash.iodemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferExample2 
{
	public static void main(String args[])
	{
		try
		{
			//write data to file
			FileOutputStream fout=new FileOutputStream("buffer2.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String data="I am Happy";
			byte b[]=data.getBytes();
			bout.write(b);
			bout.flush();
			fout.close();
			//read data in file
			FileInputStream fin=new FileInputStream("buffer2.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			int i;
			while((i=bin.read())!=-1)
			{
				System.out.println((char)i);
			}
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception :"+e);
		}
	}
}
