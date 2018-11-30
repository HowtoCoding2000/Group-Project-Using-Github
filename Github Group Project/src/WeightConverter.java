import java.math.*;
import java.text.*;
import java.util.*;

public class WeightConverter
	{
		static Scanner userInput = new Scanner(System.in);
		static String[] units = {"Pounds", "Kilograms", "Ounces", "Stones(UK)", "Metric Tons", "Pennyweights", "Grains", "Tons", "Grams", "Carats", "Imperial Tons(UK)"};    
		
		public static void main(String[] args)
		{
			weightConverter();
			
		}
		static NumberFormat formatter = new DecimalFormat();
		static int startingUnit;
		static int unitAmount;
		static double answer;
		static BigInteger largeAnswer;
		static int endingUnit;

		private static void weightConverter()
			{
				System.out.println("Welcome to the weight converter. "
						+ "\nWhat units are you starting from?");
				int i = 1;
				for(String s: units)
					{
						System.out.println("[" + i +"] " + s);
						i++;
					}
				startingUnit = userInput.nextInt();
				
				if(startingUnit == 1)
					{
						System.out.println("How many pounds are you converting?");
						unitAmount = userInput.nextInt();
						lbs();
					}
				else if(startingUnit == 2)
					{
						System.out.println("How many kilograms are you converting?");
						unitAmount = userInput.nextInt();
						kg();
					}
				else if(startingUnit == 3)
					{
						System.out.println("How many ounces are you converting?");
						unitAmount = userInput.nextInt();
						oz();
					}
				else if(startingUnit == 4)
					{
						System.out.println("How many stones are you converting?");
						unitAmount = userInput.nextInt();
						stones();
					}
				else if(startingUnit == 5)
					{
						System.out.println("How many metric tons are you converting?");
						unitAmount = userInput.nextInt();
						metricTons();
					}
				else if(startingUnit == 6)
					{
						System.out.println("How many pennyweights are you converting?");
						unitAmount = userInput.nextInt();
						pennyWeights();
					}
				else if(startingUnit == 7)
					{
						System.out.println("How many grains are you converting?");
						unitAmount = userInput.nextInt();
						grains();
					}
				else if(startingUnit == 8)
					{
						System.out.println("How many tons are you converting?");
						unitAmount = userInput.nextInt();
						tons();
					}
				else if(startingUnit == 9)
					{
						System.out.println("How many grams are you converting?");
						unitAmount = userInput.nextInt();
						grams();
					}
				else if(startingUnit == 10)
					{
						System.out.println("How many carats are you converting?");
						unitAmount = userInput.nextInt();
						Carats();
					}
				else if(startingUnit == 11)
					{
						System.out.println("How many imperial tons are you converting?");
						unitAmount = userInput.nextInt();
						imperialTons();
					}
				
				
			}

		private static void lbs()
			{
				System.out.println("What unit would you like to convert to?");
				int i = 1;
				for(String s: units)
					{
						System.out.println("[" + i +"] " + s);
						i++;
					}
				endingUnit = userInput.nextInt();
				
				if(endingUnit == 1)			//pounds
					{
						answer = unitAmount * 1;
					}
				else if(endingUnit == 2)	//kilogram
					{
						answer = unitAmount / 2.205;
					}
				else if(endingUnit == 3)	//ounces
					{
						answer = unitAmount * 16.0;
					}
				else if(endingUnit == 4)	//stones
					{
						answer = unitAmount / 14.0;
					}
				else if(endingUnit == 5)	//metric tons
					{
						answer = unitAmount / 2204.623;
					}
				else if(endingUnit == 6)	//pennyweights
					{
						answer = unitAmount * 291.667;
					}
				else if(endingUnit == 7)	//grains
					{
						answer = unitAmount * 7000.0;
					}
				else if(endingUnit == 8)	//tons
					{
						answer = unitAmount / 2000.0;
					}
				else if(endingUnit == 9)	//grams
					{
						answer = unitAmount * 453.592;
					}
				else if(endingUnit == 10)	//carats
					{
						answer = unitAmount * 2267.962;
					}
				else if(endingUnit == 11) //imperial tons
					{
						answer = unitAmount / 2240.0;
					}
				
				result();
				
			}

		private static void kg()
			{
				System.out.println("What unit would you like to convert to?");
				int i = 1;
				for(String s: units)
					{
						System.out.println("[" + i +"] " + s);
						i++;
					}
				endingUnit = userInput.nextInt();
				
				if(endingUnit == 1)			//pounds
					{
						answer = unitAmount * 2.205;
					}
				else if(endingUnit == 2)	//kilogram
					{
						answer = unitAmount * 1;
					}
				else if(endingUnit == 3)	//ounces
					{
						answer = unitAmount * 35.274;
					}
				else if(endingUnit == 4)	//stones
					{
						answer = unitAmount / 6.35;
					}
				else if(endingUnit == 5)	//metric tons
					{
						answer = unitAmount / 1000.0;
					}
				else if(endingUnit == 6)	//pennyweights
					{
						answer = unitAmount * 643.015;
					}
				else if(endingUnit == 7)	//grains
					{
						answer = unitAmount * 15432.358;
					}
				else if(endingUnit == 8)	//tons
					{
						answer = unitAmount / 907.185;
					}
				else if(endingUnit == 9)	//grams
					{
						answer = unitAmount * 1000.0;
					}
				else if(endingUnit == 10)	//carats
					{
						answer = unitAmount * 5000.0;
					}
				else if(endingUnit == 11) //imperial tons
					{
						answer = unitAmount / 1016.047;
					}
				
				result();
				
			}

		private static void oz()
			{
				System.out.println("What unit would you like to convert to?");
				int i = 1;
				for(String s: units)
					{
						System.out.println("[" + i +"] " + s);
						i++;
					}
				endingUnit = userInput.nextInt();
				
				if(endingUnit == 1)			//pounds
					{
						answer = unitAmount / 16.0;
					}
				else if(endingUnit == 2)	//kilogram
					{
						answer = unitAmount / 35.274;
					}
				else if(endingUnit == 3)	//ounces
					{
						answer = unitAmount * 1;
					}
				else if(endingUnit == 4)	//stones
					{
						answer = unitAmount / 224.0;
					}
				else if(endingUnit == 5)	//metric tons
					{
						answer = unitAmount / 35273.962;
					}
				else if(endingUnit == 6)	//pennyweights
					{
						answer = unitAmount * 18.229;
					}
				else if(endingUnit == 7)	//grains
					{
						answer = unitAmount * 437.5;
					}
				else if(endingUnit == 8)	//tons
					{
						answer = unitAmount / 32000;
					}
				else if(endingUnit == 9)	//grams
					{
						answer = unitAmount * 28.35;
					}
				else if(endingUnit == 10)	//carats
					{
						answer = unitAmount * 141.748;
					}
				else if(endingUnit == 11) //imperial tons
					{
						answer = unitAmount / 35840.0;
					}
				
				result();
				
			}

		private static void stones()
			{
				System.out.println("What unit would you like to convert to?");
				int i = 1;
				for(String s: units)
					{
						System.out.println("[" + i +"] " + s);
						i++;
					}
				endingUnit = userInput.nextInt();
				
				if(endingUnit == 1)			//pounds
					{
						answer = unitAmount * 14.0;
					}
				else if(endingUnit == 2)	//kilogram
					{
						answer = unitAmount * 6.35;
					}
				else if(endingUnit == 3)	//ounces
					{
						answer = unitAmount * 224.0;
					}
				else if(endingUnit == 4)	//stones
					{
						answer = unitAmount * 1;
					}
				else if(endingUnit == 5)	//metric tons
					{
						answer = unitAmount / 157.473;
					}
				else if(endingUnit == 6)	//pennyweights
					{
						answer = unitAmount * 4083.333;
					}
				else if(endingUnit == 7)	//grains
					{
						answer = unitAmount * 98000.0;
					}
				else if(endingUnit == 8)	//tons
					{
						answer = unitAmount / 142.857;
					}
				else if(endingUnit == 9)	//grams
					{
						answer = unitAmount * 6350.293;
					}
				else if(endingUnit == 10)	//carats
					{
						answer = unitAmount * 31751.466;
					}
				else if(endingUnit == 11) //imperial tons
					{
						answer = unitAmount / 160.0;
					}
				
				result();
				
			}

		private static void metricTons()
			{
				System.out.println("What unit would you like to convert to?");
				int i = 1;
				for(String s: units)
					{
						System.out.println("[" + i +"] " + s);
						i++;
					}
				endingUnit = userInput.nextInt();
				
				if(endingUnit == 1)			//pounds
					{
						answer = unitAmount * 2204.623;
					}
				else if(endingUnit == 2)	//kilogram
					{
						answer = unitAmount * 1000.0;
					}
				else if(endingUnit == 3)	//ounces
					{
						answer = unitAmount * 35273.962;
					}
				else if(endingUnit == 4)	//stones
					{
						answer = unitAmount * 157.473;
					}
				else if(endingUnit == 5)	//metric tons
					{
						answer = unitAmount * 1;
					}
				else if(endingUnit == 6)	//pennyweights
					{
						answer = unitAmount * 643014.931;
					}
				else if(endingUnit == 7)	//grains
					{
						answer = unitAmount * 1.543e+7;
					}
				else if(endingUnit == 8)	//tons
					{
						answer = unitAmount * 1.102;
					}
				else if(endingUnit == 9)	//grams
					{
						answer = unitAmount *1e+6;
					}
				else if(endingUnit == 10)	//carats
					{
						answer = unitAmount * 5e+6;
					}
				else if(endingUnit == 11) //imperial tons
					{
						answer = unitAmount / 1.016;
					}
				
				result();
				
			}

		private static void pennyWeights()
			{
				System.out.println("What unit would you like to convert to?");
				int i = 1;
				for(String s: units)
					{
						System.out.println("[" + i +"] " + s);
						i++;
					}
				endingUnit = userInput.nextInt();
				
				if(endingUnit == 1)			//pounds
					{
						answer = unitAmount / 291.667;
					}
				else if(endingUnit == 2)	//kilogram
					{
						answer = unitAmount / 643.015;
					}
				else if(endingUnit == 3)	//ounces
					{
						answer = unitAmount / 18.229;
					}
				else if(endingUnit == 4)	//stones
					{
						answer = unitAmount / 4083.333;
					}
				else if(endingUnit == 5)	//metric tons
					{
						answer = unitAmount / 643014.931;
					}
				else if(endingUnit == 6)	//pennyweights
					{
						answer = unitAmount * 1;
					}
				else if(endingUnit == 7)	//grains
					{
						answer = unitAmount * 24.0;
					}
				else if(endingUnit == 8)	//tons
					{
						answer = unitAmount / 583333.333;
					}
				else if(endingUnit == 9)	//grams
					{
						answer = unitAmount * 1.555;
					}
				else if(endingUnit == 10)	//carats
					{
						answer = unitAmount * 7.776;
					}
				else if(endingUnit == 11) //imperial tons
					{
						answer = unitAmount / 653333.333;
					}
				
				result();
				
			}

		private static void grains()
			{
				System.out.println("What unit would you like to convert to?");
				int i = 1;
				for(String s: units)
					{
						System.out.println("[" + i +"] " + s);
						i++;
					}
				endingUnit = userInput.nextInt();
				
				if(endingUnit == 1)			//pounds
					{
						answer = unitAmount / 7000.0;
					}
				else if(endingUnit == 2)	//kilogram
					{
						answer = unitAmount / 15432.358;
					}
				else if(endingUnit == 3)	//ounces
					{
						answer = unitAmount / 437.5;
					}
				else if(endingUnit == 4)	//stones
					{
						answer = unitAmount / 98000.0;
					}
				else if(endingUnit == 5)	//metric tons
					{
						answer = unitAmount / 1.543e+7;
					}
				else if(endingUnit == 6)	//pennyweights
					{
						answer = unitAmount / 24.0;
					}
				else if(endingUnit == 7)	//grains
					{
						answer = unitAmount * 1;
					}
				else if(endingUnit == 8)	//tons
					{
						answer = unitAmount / 1.4e+7;
					}
				else if(endingUnit == 9)	//grams
					{
						answer = unitAmount / 15.432;
					}
				else if(endingUnit == 10)	//carats
					{
						answer = unitAmount / 3.086;
					}
				else if(endingUnit == 11) //imperial tons
					{
						answer = unitAmount / 1.568e+7;
					}
				
				result();
				
			}

		private static void tons()
			{
				System.out.println("What unit would you like to convert to?");
				int i = 1;
				for(String s: units)
					{
						System.out.println("[" + i +"] " + s);
						i++;
					}
				endingUnit = userInput.nextInt();
				
				if(endingUnit == 1)			//pounds
					{
						answer = (double) (unitAmount * 2000);
					}
				else if(endingUnit == 2)	//kilogram
					{
						answer = (double) (unitAmount * 907.185);
					}
				else if(endingUnit == 3)	//ounces
					{
						answer = unitAmount * 32000;
					}
				else if(endingUnit == 4)	//stones
					{
						answer = unitAmount * 142.857;
					}
				else if(endingUnit == 5)	//metric tons
					{
						answer = unitAmount / 1.102;
					}
				else if(endingUnit == 6)	//pennyweights
					{
						answer = unitAmount * 583333.333;
					}
				else if(endingUnit == 7)	//grains
					{
						answer = unitAmount * 1.4e+7;
					}
				else if(endingUnit == 8)	//tons
					{
						answer = unitAmount * 1;
					}
				else if(endingUnit == 9)	//grams
					{
						answer = unitAmount * 907184.74;
					}
				else if(endingUnit == 10)	//carats
					{
						answer = unitAmount * 4.536e+6;
					}
				else if(endingUnit == 11) //imperial tons
					{
						answer = unitAmount / 1.12;
					}
				
				result();
				
			}

		private static void grams()
			{
				System.out.println("What unit would you like to convert to?");
				int i = 1;
				for(String s: units)
					{
						System.out.println("[" + i +"] " + s);
						i++;
					}
				endingUnit = userInput.nextInt();
				
				if(endingUnit == 1)			//pounds
					{
						answer = (double) (unitAmount / 453.592);
					}
				else if(endingUnit == 2)	//kilogram
					{
						answer = (double) (unitAmount / 1000);
					}
				else if(endingUnit == 3)	//ounces
					{
						answer = unitAmount / 28.35;
					}
				else if(endingUnit == 4)	//stones
					{
						answer = unitAmount / 6350.293;
					}
				else if(endingUnit == 5)	//metric tons
					{
						answer = unitAmount / 1e+6;
					}
				else if(endingUnit == 6)	//pennyweights
					{
						answer = unitAmount / 1.555;
					}
				else if(endingUnit == 7)	//grains
					{
						answer = unitAmount * 15.432;
					}
				else if(endingUnit == 8)	//tons
					{
						answer = unitAmount / 907184.74;
					}
				else if(endingUnit == 9)	//grams
					{
						answer = unitAmount * 1;
					}
				else if(endingUnit == 10)	//carats
					{
						answer = unitAmount * 5;
					}
				else if(endingUnit == 11) //imperial tons
					{
						answer = unitAmount / 1.016e+6;
					}
				
				result();
				
			}

		private static void Carats()
			{
				System.out.println("What unit would you like to convert to?");
				int i = 1;
				for(String s: units)
					{
						System.out.println("[" + i +"] " + s);
						i++;
					}
				endingUnit = userInput.nextInt();
				
				if(endingUnit == 1)			//pounds
					{
						answer = (double) (unitAmount / 2267.962);
					}
				else if(endingUnit == 2)	//kilogram
					{
						answer = (double) (unitAmount / 5000);
					}
				else if(endingUnit == 3)	//ounces
					{
						answer = unitAmount / 141.748;
					}
				else if(endingUnit == 4)	//stones
					{
						answer = unitAmount / 31751.466;
					}
				else if(endingUnit == 5)	//metric tons
					{
						answer = unitAmount / 5e+6;
					}
				else if(endingUnit == 6)	//pennyweights
					{
						answer = unitAmount / 7.776;
					}
				else if(endingUnit == 7)	//grains
					{
						answer = unitAmount * 3.086;
					}
				else if(endingUnit == 8)	//tons
					{
						answer = unitAmount / 4.536e+6;
					}
				else if(endingUnit == 9)	//grams
					{
						answer = unitAmount / 5.0;
					}
				else if(endingUnit == 10)	//carats
					{
						answer = unitAmount * 1;
					}
				else if(endingUnit == 11) //imperial tons
					{
						answer = unitAmount / 5.08e+6;
					}
				
				result();
				
			}

		private static void imperialTons()
			{
				System.out.println("What unit would you like to convert to?");
				int i = 1;
				for(String s: units)
					{
						if(i != startingUnit)
							{
								System.out.println("[" + i +"] " + s);
								i++;
							}
					}
				endingUnit = userInput.nextInt();
				
				if(endingUnit == 1)			//pounds
					{
						answer = unitAmount * 2240;
					}
				else if(endingUnit == 2)	//kilogram
					{
						answer = (long) (unitAmount * 1016.047);
					}
				else if(endingUnit == 3)	//ounces
					{
						answer = unitAmount * 35840;
					}
				else if(endingUnit == 4)	//stones
					{
						answer = unitAmount * 160;
					}
				else if(endingUnit == 5)	//metric tons
					{
						answer = (long) (unitAmount * 1.016);
					}
				else if(endingUnit == 6)	//pennyweights
					{
						answer = (long) (unitAmount * 653333.333);
					}
				else if(endingUnit == 7)	//grains
					{
						answer = unitAmount * 15680000;
					}
				else if(endingUnit == 8)	//tons
					{
						answer = (long) (unitAmount * 1.12);
					}
				else if(endingUnit == 9)	//grams
					{
						answer = unitAmount * 1016000;
					}
				else if(endingUnit == 10)	//carats
					{
						answer = (long) (unitAmount * 5080000);
					}
				
				result();
			}
		
		private static void result()
			{
				for(int i = 0; i <= units.length; i++)
					{
						if(i == startingUnit)
							{
								for(int j = 0; j <= units.length; j++)
									{
										if(j == endingUnit)
											{
												System.out.println(unitAmount + " " + units[startingUnit - 1] + " converts to " + answer + " " + units[endingUnit - 1]);
													
											}
									}
							}
						
					}
				
			}
		
		
	}
