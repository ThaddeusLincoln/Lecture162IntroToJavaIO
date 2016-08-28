package com.turing.jdev.io.test;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	 public static void main(String[] args){
		 
		 FileWriter locFile = null;
		 try {
			locFile = new FileWriter("locations.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				
				// this line will guarantee that we don't get a NPE in case
				// locFile = new FileWriter("locations.txt");
				// doesn't executes correctly, for whatever reason and locFile is still null when whis line
				// it attempted to be executed.
				if(locFile != null){
					locFile.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	 }
}
