package com.techelevator;

public class KataStringCalculator {

	
	public int convertStringToInt (String numbers) {
		
		int converted = 0;
		
		if (numbers.length() == 0) {}
		
		if (numbers.length() == 1) {
			return converted += Integer.parseInt(numbers);
		}
		
		if(numbers.length() >= 1) {
			String splitter = numbers.substring(1, 2);
			
			String[] allNumbers = (numbers.split(splitter));
			
			for ( String thing : allNumbers) {				
				converted += Integer.parseInt(thing);
			}		
		} return converted;
	}
}