package com.yash.com.yash.Inputoutpuntclassdemo1;

import java.io.*;
/**
 * Created progam for the buffer reader for read the value 
 *
 */

public class Bufferonlyreaddata 
{
	public static void main(String args[]) throws IOException  //IOException is use because when to try fileinlutstream it force to try catch
	{
		FileInputStream fin=new FileInputStream("demo.txt");  //tack input form txt data and read the data from bufferreader
		BufferedInputStream bin= new BufferedInputStream(fin);
		int x=0;
		while((x=bin.read())!=-1)       
			System.out.println((char)x);
		bin.close();
		fin.close();
		
	}

}
