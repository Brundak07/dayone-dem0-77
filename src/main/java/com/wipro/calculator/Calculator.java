package com.wipro.calculator;

import java.util.Scanner;
public class Calculator {
	
	//entry point of java program
	public static void main(String args[]) {
		
		//read input from keyboard
		//new keyword used to create object
		Scanner scan=new Scanner(System.in);
		//variables - Local
		int numberOne,numberTwo;
		System.out.println("enter the number 1");
		numberOne=scan.nextInt();
		System.out.println("enter the number 2");
		numberTwo=scan.nextInt();
		int result=numberOne+numberTwo;
		System.out.println("Addition of Two number" + result);
		System.out.println("Welcome to Stackroute Program");
	}

}
