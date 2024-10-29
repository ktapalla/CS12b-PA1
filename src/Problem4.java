//Kirsten Tapalla - CoSi 12B - Programming Assignment 1 - Problem 4

import java.util.*;

public class Problem4 {
	
	//Converts name to pig latin
	public static String pigLatin(String fName, String lName) {
		fName = fName.toLowerCase();
		lName = lName.toLowerCase();
		String fNamePL = fName.substring(1,2).toUpperCase() + fName.substring(2) + fName.substring(0,1) + "ay";
		String lNamePL = lName.substring(1,2).toUpperCase() + lName.substring(2) + lName.substring(0,1) + "ay";
		return fNamePL + " " + lNamePL;
	}
	
	public static void main(String[] args) {
		//Request + initialize name
		Scanner console = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String fName = console.next();
		String lName = console.next();
		//Executes method
		String pigLatin = pigLatin(fName, lName);
		System.out.println (pigLatin);

	}

}
