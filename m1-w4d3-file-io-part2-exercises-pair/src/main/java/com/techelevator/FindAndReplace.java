package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) {
		System.out.println("========= Welcome to this simple word-replacing program! =========");
		System.out.println("Note: The new file containing the replacement word will be saved in the same folder as the original!");
		
		File inputFile = getInputFileFromUser();
		String findWord = getFindWord();
		String replacementWord = getReplacementWord(findWord);
		replacer(inputFile, findWord, replacementWord);

	}
	
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);
		if(inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if(inputFile.isFile() == false) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}
	
	private static String getFindWord() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter a word you'd like to find to replace within the text >>> ");
		String findWord = userInput.nextLine();
		
		return findWord;		
	}
	
	private static String getReplacementWord(String findWord) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter a replacement word for " + findWord + ">>>" );
		String replacementWord = userInput.nextLine();
		
		return replacementWord;	
	}
	
	private static void replacer(File inputFile, String findWord, String replacementWord) {
		File writtenWithReplacement = new File("Replacement.txt");
		
		try (
				Scanner read = new Scanner(inputFile); 
				PrintWriter write = new PrintWriter(writtenWithReplacement)
		) {
			while(read.hasNextLine()) {
				String line = read.nextLine();
				if (line.contains(findWord)) {
					line = line.replace(findWord, replacementWord);
				}
				write.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
