# README - COSI 12b Programming Assignment 1

The code provided in this repository contains the solutions to PA1 for COSI 12b - Advanced Programming Techniques in Java. The 5 different problems will be described below, as well as the instructions for how to install and run the code. Each problem is solved within its own Java file/class. 

Note: This assignment was done for a class, and we were limited to using only Java features we had covered in class thus far. This may make the assignment solutions more complicated/longer than they would have to be. 


## Installation and Execution 

Get the files from GitHub and in your terminal/console move into the src folder of the project. To compile all of the java files for the entire assignment, run the following line: 

``` javac *.java ```

After that, to run the solutions to each of the indidual problem included in the assignment, run ``` java Problem# ```. In this case, the # will indicate the solution to which problem number of the assignment you are running. For exeample, to run the solution for Problem 1 of the assignment, you would run the following line: 

``` java Problem1 ```

If you wanted to run the solution for Problem 3, you would run the following line instead: 

``` java Problem3 ```

## Problem Descriptions 

### Problem 1

The program reads a positive integer value and computes the following sequence: 

* If the value is even, halve it  
* If the value is odd, multuply by 3 and add 1 
* Repeat this until the value is 1, printing out each value 
* Print out how many of these operations were performed to reach the final value of 1 

Note: If the input value entered by the user is less than 1, the program prints an Error message and exits the program. Also, once the computations have been completed and the final value of 1 is reached, the program automatically exits. To use the program again and try with different values, user should rerun the program and enter their desired new input value. 

### Problem 2 

The program promts the user for a number (less than 5000) and displays it in Roman numerals. 

Note: The program doesn't take values less than 1 or greater than 4999, and will exit the program if the user enters an invalid value. Also, once the Roman numeral versions of the user's original input value has be returned, the program automatically exits. To use the program again and try with different values, user should rerun the program and enter their desired new input value. 

### Problem 3

This program produces a Caesar cipher of the user's provided message string. A Casear is formed by roating each letter by a given amount. Both the original message and the rotation value will be provided by the user. The transformed message will be returned to the user in all uppercase letters. 

Note: Once the original input message has been transformed and returned to the user, the program will automatically exit. To use the program again and try with a different input message and/or rotation number, the user should rerun the program and enter their desired new input values. 

### Problem 4 

The program accepts two string variables from the user, ``` first ``` and ``` last ```, which they should populate with their name. Both strings are converted into lowercase, and a new string is returned to the user with the pig latin version of their first and last name with the first letter of each now capitalized. 

Note: Once the original input name has been translated into pig latin and returned to the user, the program will automatically exit. To use the program again and try with a different input name, the user should rerun the program and enter their desired new input values. 

### Problem 5 

This program prompts the user for a positive integer value and displays the each individual digit one per line to the user. 

Note: Once the digits in the original input integer has been displayed to the user line by line, the program will automatically exit. To use the program again and try with a different input value, the user should rerun the program and enter their desired new input value. 