package com.poonam.mathcalculator;

public class MathCalculator {

	public static void main(String args[]) {
		System.out.println("Hello World");
		
		addition();
		substraction();
		multiplication();
		division();
	}
	
	
	public static void addition()
	{
		double number1 = -100.00;
		double number2 = -200.50;
		double result;
		
		result= number1+number2;
		System.out.println("Addition of 2 numbers = " + result);
	}
	
	
	public static void substraction()
	{
		double number1 = 100.00;
		double number2 = 200.50;
		double result;
		
		result= number1 - number2;
		System.out.println("Substraction of 2 numbers = " + result);
	}
	
	public static void multiplication()
	{
		double number1 = 10;
		double number2 = 5;
		double result;
		
		result= number1 * number2;
		System.out.println("Multiplication of 2 numbers = " + result);
	}
	
	public static void division()
	{
		double number1 = 50;
		double number2 = 20;
		double result;
		
		result= number1 / number2;
		System.out.println("Division of 2 numbers = " + result);
	}
	
	
	
}
