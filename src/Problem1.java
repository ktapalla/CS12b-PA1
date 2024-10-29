//Kirsten Tapalla - CoSi 12B - Programming Assignment 1 - Problem 1

import java.util.*;

public class Problem1 {

	public static String solution (int val) {
		String str = "";
		int count = 0;
		String nextVal = "Next value is: ";

		//Error message
		if (val < 1) {  
			return "Error";
		}
		else {
			str = "Initial value is: " + val + '\n';
		}

		while (val != 1) { 
			//Even value 
			if(val % 2 == 0) { 
				val /= 2;
				count++;
				//Final val (1) 
				if (val == 1) {
					str += "Final value " + val + ", number of operations performed " + count + '\n';
				}
				else {
					str += nextVal + val + '\n';
				}
			}
			//Odd value
			else if(val % 2 == 1) {  
				val = (val * 3) + 1; 
				count++;
				str += nextVal + val + '\n'; 
			}
		}
		return str;
	}

	public static void main(String[] args) {
		//Requests value from user and initializes variable  
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a positive value.");
		int val = console.nextInt();
		//Execute method
		String result = solution(val);
		System.out.println(result);

	}
}

