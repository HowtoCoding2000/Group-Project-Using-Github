import java.util.ArrayList;
import java.util.Scanner;
public class Calculator {
private String operation;
private double numberOne;
private double numberTwo;
	public Calculator( double a, String sign, double b)
	{
		
		numberOne = a;
		operation = sign;
		numberTwo = b;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double getNumberOne() {
		return numberOne;
	}
	public void setNumberOne(double numberOne) {
		this.numberOne = numberOne;
	}
	public double getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(double numberTwo) {
		this.numberTwo = numberTwo;
	}
static void add(double a, double b) {
		
		System.out.println("Your answer is: " + (a + b));
	}

	 static void subtract(double a, double b) {
		
		System.out.println("Your anser is " + (a - b));
	}

	static void multiply(double a, double b) {
		
		System.out.println("Your answer is: " + (a * b));
	}

	static void divide(double a, double b) {
		
		System.out.println("Your answer is: " + (a / b));
	}
	}


