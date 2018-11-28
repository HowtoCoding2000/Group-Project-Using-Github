import java.util.Scanner;

public class CurrencyConvertor {

	public static void main(String[] args) 
	{
	 currency();
	}
	static boolean run = true;
	static double finalNumber = 0;
	public static void currency()
	{
	while(run == true)
	{

		System.out.println("Currency Convertor:");
		System.out.println("1. US Dollar to Euro");
		System.out.println("2. US Dollar to British Pound");
		System.out.println("3. Us Dollar to Canadian Dollar");
		System.out.println("Please choose an option");
		Scanner userInput = new Scanner(System.in);
		int input = userInput.nextInt();
		//attempt
		
			switch(input)
			{
			case 1:
			{
				dollarToEuro();
				break;
			}
			case 2:
			{
				dollarToPound();
			}	
			case 3:
			{
				dollarToCanada();
			}
			}
		}
	}

	private static void dollarToCanada() {
		System.out.println("US Dollar to Canadian Dollar convertor.  Please type an amount of US Currency.");
		Scanner convertor = new Scanner(System.in);
		int USCanada = convertor.nextInt();
		finalNumber = USCanada * 1.33;
		System.out.println("The conversion is " + finalNumber);
	}
	private static void dollarToPound() {
		System.out.println("US Dollar to Pound convertor.  Please type an amount of US Currency.");
		Scanner convertor = new Scanner(System.in);
		int USPound = convertor.nextInt();
		finalNumber = USPound * .78;
		System.out.println("The conversion is " + finalNumber);
	}
	private static void dollarToEuro() {
		System.out.println("US Dollar to Euro convertor.  Please type an amount of US Currency.");
		Scanner convertor = new Scanner(System.in);
		int USEuro = convertor.nextInt();
		finalNumber = USEuro * .88;
		System.out.println("The conversion is " + finalNumber);
			
		}
		
		
	

}




