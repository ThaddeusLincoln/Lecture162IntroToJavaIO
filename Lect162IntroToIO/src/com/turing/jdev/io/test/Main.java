package com.turing.jdev.io.test;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	 public static void main(String[] args) throws IOException{
		 
		 FileWriter locFile = null;
		 try {
		
			 locFile = new FileWriter("locations.txt");
		
		 }finally{

			if(locFile != null){
				locFile.close();
			}
		}
	 }
}
