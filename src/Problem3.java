//Kirsten Tapalla - CoSi 12B - Programming Assignment 1 - Problem 3

import java.util.*;

public class Problem3 {

	//Ciphers message
	public static String CaesarCipher(String input, int key) {
		String output = "";
		input = input.toUpperCase();
		int len = input.length();
		for (int i = 0; i < len; i++) {
			char ch = input.charAt(i);
			if (ch == ' ') {
				output += ch;
			}
			else {
				ch += key;
				if (ch > 'Z') {
					ch = (char) (ch - 90 + 64);
				}
				output += ch;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		//Request + initialize message and key from user
		Scanner console = new Scanner(System.in);
		System.out.print("Your message? ");
		String input = console.nextLine();
		System.out.print("Encoding key? ");
		int key = console.nextInt();
		//Executes method
		String output = CaesarCipher(input, key);
		System.out.println("Your message: " + output);
	}

}
