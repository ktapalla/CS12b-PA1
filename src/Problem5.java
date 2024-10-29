//Kirsten Tapalla - CoSi 12B - Programming Assignment 1 - Problem 5

import java.util.*;

public class Problem5 {

	public static void printIndivDig(int val) {
		int valCopy = val;
		int valDigCount = 0;
		int divideBy = 1;
		int output = 0;
		//Error if negative integer
		if (val < 0) {
			System.out.println("Error");
		}
		//Counts amount of indivual digits
		while (valCopy > 0) {
			valCopy /= 10;
			valDigCount++;
		}
		for (int i = 1; i < valDigCount; i++) {			
			divideBy *= 10;
		}
		//Obtains and prints first digit, then removes it from val
		while (divideBy > 0) {
			output = val / divideBy;
			System.out.println(output);
			val %= divideBy;
			divideBy /= 10;
		}
	}
	
	public static void main(String[] args) {
		//Requests and initializes value
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int val = console.nextInt();
		//Executes method 
		printIndivDig(val);
	}

}
