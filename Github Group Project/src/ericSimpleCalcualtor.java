import java.util.ArrayList;
import java.util.Scanner;

public class ericSimpleCalcualtor {

	public static void main(String[] args) {
		//ERIC CALCULATOR
		ArrayList<Calculator>calculationHistory = new ArrayList<Calculator>();
		boolean run = true;
		
		while(run == true)
		{
		System.out.println("Please type in an equation that you would like to know?");
		Scanner userInput = new Scanner(System.in);
		String equation = userInput.nextLine();
		String[] equationArray = equation.split(" ");
		double numberOne = Integer.parseInt(equationArray[0]);
		double numberTwo = Integer.parseInt(equationArray[2]);
		String operator = equationArray[1];
		Calculator c = new Calculator(numberOne, operator, numberTwo);
		switch(operator)
		{
		case "+":
		{
			c.add(numberOne,numberTwo);
			break;
		}
		case "-":
		{
			c.subtract(numberOne, numberTwo);
			break;
		}	
		case "/":
			
		{
			c.divide(numberOne, numberTwo);
			break;
		}
		case "*":
		{
			c.multiply(numberOne, numberTwo);
			break;
		}
	}
		
	}
	}

	}

