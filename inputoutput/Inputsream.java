package com.yash.com.yash.Inputoutpuntclassdemo1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Inputsream
{
	public static void main(String args[])
	{
		 try  {  
	            InputStream stream = new FileInputStream("demo.txt");  
	            Reader reader = new InputStreamReader(stream);  
	            int data = reader.read();  
	           // while (data != -1) {  
	                System.out.print((char) data);  
	                data = reader.read();  
	           // }  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	    }  
	}

