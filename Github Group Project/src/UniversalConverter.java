import java.util.Scanner;
public class UniversalConverter
	{
		static int userConverterSelection = 0;
		static Scanner userInput = new Scanner(System.in);
		static Scanner userStringput = new Scanner(System.in);
		static String userName = "";
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				greetUser();
				runUniversalConverter();
			}
		public static void greetUser()
			{
				System.out.println("Welcome to the Universal Converter.");
				System.out.println("What is your name?");
				userName = userStringput.nextLine();
				System.out.println("Hello, " + userName + ".");
			}
		public static void runUniversalConverter()
			{
				boolean runningUniversalConverter = true;
				while (runningUniversalConverter)
					{
						System.out.println("Please choose the converter you would like to use.");
						System.out.println("(1) Temperature Converter.");
						System.out.println("(2) Currency Converter");
						System.out.println("(3) Weight Converter");
						System.out.println("(4) Distance Converter");
						userConverterSelection = userInput.nextInt();
						//switch statement directing toward converter methods
						switch (userConverterSelection)
						{
							case 1:
									{
										runningUniversalConverter = false;
										TemperatureConverter.convertTemperature();
									}
							case 2:
									{
										runningUniversalConverter = false;
										CurrencyConvertor.currency();
									}
							case 3:
									{
										runningUniversalConverter = false;
										WeightConverter.weightConverter();
									}
							case 4:
									{
										runningUniversalConverter = false;
										Distance.distanceConvert();
									}
							default:
									{
										System.out.println("Please choose from the available converters");
									}
						}
					}
			}

	}
