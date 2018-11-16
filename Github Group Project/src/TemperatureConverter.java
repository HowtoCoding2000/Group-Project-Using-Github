import java.util.Scanner;
public class TemperatureConverter
	{
		static boolean firstTempFarenheit = false;
		static boolean firstTempCelcius = false;
		static boolean firstTempKelvin = false;
		static boolean convertToFarenheit = false;
		static boolean convertToCelcius = false;
		static boolean convertToKelvin = false;
		static double firstTemp = 0;
		static String originalTempUnit = "";
		static int firstTempUnit = 0;
		static String convertedUnit = "";
		static int conversionUnit = 0;
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				convertTemperature();
			}
		public static void convertTemperature()
			{
				System.out.println("Enter the temperature you would like to convert");
				firstTemp = userInput.nextDouble();
				System.out.println("Enter the number that corresponds with the unit that your temperature is in.");
				System.out.println("(1) Farenheit");
				System.out.println("(2) Celcius");
				System.out.println("(3) Kelvin");
				firstTempUnit = userInput.nextInt();
				if (firstTempUnit != 1 && firstTempUnit != 2 && firstTempUnit != 3)
					{
						boolean running = true;
						while (running)
							{
								System.out.println("Enter the number that corresponds with the unit that your temperature is in.");
								System.out.println("(1) Farenheit");
								System.out.println("(2) Celcius");
								System.out.println("(3) Kelvin");
								firstTemp = userInput.nextDouble();
								if (firstTempUnit == 1 || firstTempUnit == 2 || firstTempUnit == 3)
									{
										running = false;
									}
							}
					}
				else if (firstTempUnit == 1)
					{
						firstTempFarenheit = true;
						originalTempUnit = "Farenheit";
					}
				else if (firstTempUnit == 2)
					{
						firstTempCelcius = true;
						originalTempUnit = "Celcius";
					}
				else if (firstTempUnit == 3)
					{
						firstTempKelvin = true;
						originalTempUnit = "Kelvin";
					}
				System.out.println("Enter the number that corresponds with the unit you want to convert " + firstTemp + " degrees " + originalTempUnit + ".");
				System.out.println("(1) Farenheit");
				System.out.println("(2) Celcius");
				System.out.println("(3) Kelvin");
				firstTemp = userInput.nextDouble();
				if (firstTemp != 1 && firstTemp != 2 && firstTemp != 3)
					{
						boolean running = true;
						while (running)
							{
								System.out.println("Enter the number that corresponds with the unit that your temperature is in.");
								System.out.println("(1) Farenheit");
								System.out.println("(2) Celcius");
								System.out.println("(3) Kelvin");
								conversionUnit = userInput.nextInt();
								if (firstTemp == 1 || firstTemp == 2 || firstTemp == 3)
									{
										running = false;
									}
							}
					}
				else if (conversionUnit == 1)
					{
						convertToFarenheit = true;
						convertedUnit = "Farenheit";
					}
				else if (conversionUnit == 2)
					{
						convertToCelcius = true;
						convertedUnit = "Celcius";
					}
				else if (conversionUnit == 3)
					{
						convertToKelvin = true;
						convertedUnit = "Kelvin";
					}
				
			}
	}
