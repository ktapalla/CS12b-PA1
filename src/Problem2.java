//Kirsten Tapalla - CoSi 12B - Programming Assignment 1 - Problem 2

import java.util.*;

public class Problem2 {

	//Converts number to roman numerals
	public static String RomanNum(int x) {
		String str = "";
		int ind = 0;
		//Error
		if (x >= 5000) {
			return "Error";
		}
		//Thousands
		if (x / 1000 > 0) {
			ind = x / 1000;
			for (int i = 0; i < ind; i++) {
				str += "M";
			}
			x %= 1000;
		}
		//Hundreds
		if (x / 100 > 0) {
			ind = x / 100;
			if (ind < 4) {
				for (int i = 0; i < ind; i++) {
					str += "C";
				}
			}
			else if(ind == 4) {
				str += "CD";
			}
			else if(ind >= 5) {
				if (ind == 9) {
					str += "CM";
				}
				else {
					str += "D";
					for (int i = 5; i < ind; i++) {
						str += "C";
					}
				}
			}
			x %= 100;
		}
		//Tens
		if (x / 10 > 0) {
			ind = x / 10;
			if (ind < 4) {
				for (int i = 0; i < ind; i++) {
					str += "X";
				}
			}
			else if(ind == 4) {
				str += "XL";
			}
			else if(ind >= 5) {
				if (ind == 9) {
					str += "XC";
				}
				else {
					str += "L";
					for (int i = 5; i < ind; i++) {
						str += "X";
					}
				}
			}
			x %= 10;
		}
		//Ones
		if (x / 1 > 0) {
			ind = x;
			if (ind < 4) {
				for (int i = 0; i < ind; i++) {
					str += "I";
				}
			}
			else if(ind == 4) {
				str += "IV";
			}
			else if(ind >= 5) {
				if (ind == 9) {
					str += "IX";
				}
				else {
					str += "V";
					for (int i = 5; i < ind; i++) {
						str += "I";
					}
				}
			}
		}
		return str;
	}

	public static void main(String[] args) {
		//Requests and initializes value from user
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a value less than 5000");
		int x = console.nextInt();
		//Execute method
		String romanNum = RomanNum(x);
		System.out.println(romanNum);
	}

}
