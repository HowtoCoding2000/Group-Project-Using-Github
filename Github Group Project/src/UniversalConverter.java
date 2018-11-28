import java.util.Scanner;
public class UniversalConverter
	{
		static int userConverterSelection = 0;
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				System.out.println("Welcome to the Universal Converter.");
				boolean runningUniversalConverter = true;
				while (runningUniversalConverter)
					{
						System.out.println("Please choose the converter you would like to use.");
						System.out.println("(1) Temperature Converter.");
						System.out.println("(2) Calculator");
						System.out.println("(3) Weight Converter");
						userConverterSelection = userInput.nextInt();
						//switch statement directing toward converter methods
						switch (userConverterSelection)
						{
							case 1:
									{
										TemperatureConverter.convertTemperature();
									}
//							case 2:
//									{
//										converter method
//									}
//							case 3:
//									{
//										converter method
//									}
							default:
									{
										System.out.println("Please choose from the available converters");
									}
						}
					}
			}

	}
