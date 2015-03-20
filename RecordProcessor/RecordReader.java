/**
 * ===========================================================================
 * This Java class generates reads a sparse matrix from file and then 
 * writes it back into file 
 *
 * sparseFunctions.java
 * Written by: Barane Parmanathan                      November, 2012 
 * ===========================================================================
 */



package com.javaonvids.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;


public class RecordReader {
	
		public static void checkFile() {
			Scanner input = new Scanner(System.in);
			
			FileReader in;
			BufferedReader readFile;
			String lineOfText;
			String userInput;
			File file; 
			
			try {
				System.out.print("Enter a file name: ");
	  			userInput= input.next();
	  			
	  			file = new File (userInput);
				
				in = new FileReader(file);
				readFile = new BufferedReader(in);
			
			
				readFile.close();
				in.close();
			} catch (FileNotFoundException e) {
				
				while (file.exists() == false) {
					System.out.println("File does not exist or could not be found" + e.getMessage());
					System.out.print("Enter a file name: ");
					userInput= input.next();
					
					file = new File (userInput);
						
				}
		
				
				
			} catch (IOException e) {
				System.out.println("Problem reading file");
			}
						
		}
		

		public static void main (String [] args) throws IOException {
	

	
		
	    
	    checkFile(); 
	
    
	}

}