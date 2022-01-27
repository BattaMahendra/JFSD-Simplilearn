package com.Mahendra.Calculator;

import java.util.Scanner;

public class CalculatorUsingJava {
	static void calculator() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first numbers");
		double num1=sc.nextDouble();
		System.out.println("Enter the Second numbers");
		double num2=sc.nextDouble();
		sc.nextLine();
		double result=0;
		System.out.println("enter the operation in + - *  /");
		char action=sc.nextLine().charAt(0);
		switch(action) {
		case '+' :
			result=num1+num2;
			break;
			
		case '-' :
			result=num1-num2;
			break;
			
		case '*' :
			result=num1*num2;
			break;
			
		case '/' :
			result=num1+num2;
			break;
			
		default:
			  
            System.out.println("Enter the correct operator");
  
            break;
		}
		
		System.out.println(num1+" "+action+" "+num2+" = "+result);
		
		sc.close();
	}
	public static void main(String[] args) {
		calculator();
	}
}
