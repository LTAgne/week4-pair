package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		File book = new File("/Users/jaredmalvic/workspace/team0-java-week-4-pair-exercises/m1-w4d2-file-io-part1-exercises-pair/alices_adventures_in_wonderland.txt");
				
		int wordCount = 0;
		int sentCount = 0;
		
		try (Scanner input = new Scanner(book)) {
			while(input.hasNextLine()) {
				//Reads in line and stores it in String variable line
				String line = input.nextLine();
				
				//Splits line into words and sentences, respectively
				String[] lineCountWord = line.split(" +");
				String[] lineCountSent = line.split("[\\.!?]");
				
				//Counts words
				if (lineCountWord.length != 1) {
					wordCount+= lineCountWord.length;
				}	
				
				//Counts sentences
				if ( ! lineCountSent[0].contentEquals("")) {
					sentCount+= lineCountSent.length-1;	
				}
			}			
		} catch (FileNotFoundException e) {
			System.out.println("Your file doesn't exist.");
		}		
		System.out.println("Word count: " + wordCount);
		System.out.println("Sentence count: " + sentCount);
	}
}