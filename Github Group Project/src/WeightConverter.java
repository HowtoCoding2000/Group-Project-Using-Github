import java.math.*;
import java.text.*;
import java.util.*;

public class WeightConverter
	{
		static Scanner userInput;
		static String[] units = {"Pounds", "Kilograms", "Ounces", "Stones(UK)", "Metric Tons", "Pennyweights", "Grains", "Tons", "Hundredweights", "Grams", "Carats", "Milligrams", "Imperial Tons(UK)"};    
		
		public static void main(String[] args)
		{
			userInput = new Scanner(System.in);
			weightConverter();
			
			
		}
		static NumberFormat formatter = new DecimalFormat();
		static int startingUnit;
		static int unitAmount;
		static long answer;
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
						System.out.println("How many hundredweights are you converting?");
						unitAmount = userInput.nextInt();
						hundredWeights();
					}
				else if(startingUnit == 10)
					{
						System.out.println("How many grams are you converting?");
						unitAmount = userInput.nextInt();
						grams();
					}
				else if(startingUnit == 11)
					{
						System.out.println("How many carats are you converting?");
						unitAmount = userInput.nextInt();
						Carats();
					}
				else if(startingUnit == 12)
					{
						System.out.println("How many milligrams are you converting?");
						unitAmount = userInput.nextInt();
						milligram();
					}
				else if(startingUnit == 13)
					{
						System.out.println("How many imperial tons are you converting?");
						unitAmount = userInput.nextInt();
						imperialTons();
					}
				
				
			}

		private static void lbs()
			{
				// TODO Auto-generated method stub
				
			}

		private static void kg()
			{
				// TODO Auto-generated method stub
				
			}

		private static void oz()
			{
				// TODO Auto-generated method stub
				
			}

		private static void stones()
			{
				// TODO Auto-generated method stub
				
			}

		private static void metricTons()
			{
				// TODO Auto-generated method stub
				
			}

		private static void pennyWeights()
			{
				// TODO Auto-generated method stub
				
			}

		private static void grains()
			{
				// TODO Auto-generated method stub
				
			}

		private static void tons()
			{
				// TODO Auto-generated method stub
				
			}

		private static void hundredWeights()
			{
				// TODO Auto-generated method stub
				
			}

		private static void grams()
			{
				// TODO Auto-generated method stub
				
			}

		private static void Carats()
			{
				// TODO Auto-generated method stub
				
			}

		private static void milligram()
			{
				System.out.println("What unit would you like to convert to?");
				int i = 1;
				boolean occurence = false;
				for(String s: units)
					{
						if(i != startingUnit && !occurence)
							{
								System.out.println("[" + i +"] " + s);
								i++;
							}
						else if(i == startingUnit)
							{
								occurence = true;
							}
						else
							{
								System.out.println("[" + i + "]" + s);
								i++;
							}
					}
				endingUnit = userInput.nextInt();
				
				if(endingUnit == 1)			//pounds
					{
						answer = (long) (unitAmount / 453592.37);
					}
				else if(endingUnit == 2)	//kilogram
					{
						answer = (long) (unitAmount / 1e-6);
					}
				else if(endingUnit == 3)	//ounces
					{
						answer = (long) (unitAmount / 28349.523);
					}
				else if(endingUnit == 4)	//stones
					{
						answer = (long) (unitAmount / 6.35e+6);
					}
				else if(endingUnit == 5)	//metric tons
					{
						answer = (long) (unitAmount / 1e-9);
					}
				else if(endingUnit == 6)	//pennyweights
					{
						answer = (long) (unitAmount / 1555.174);
					}
				else if(endingUnit == 7)	//grains
					{
						answer = (long) (unitAmount / 64.799);
					}
				else if(endingUnit == 8)	//tons
					{
						answer = (long) (unitAmount / 9.072e+8);
					}
				else if(endingUnit == 9)	//hundredweights
					{
						answer = (long) (unitAmount / 1.96841e-8);
					}
				else if(endingUnit == 10)	//grams
					{
						answer = unitAmount / 1000;
					}
				else if(endingUnit == 11)	//carats
					{
						answer = (long) (unitAmount / 200);
					}
				else if(endingUnit == 12)	//imperial tons
					{
						answer = (long) (unitAmount / 1.016e+9);
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
				else if(endingUnit == 9)	//hundredweights
					{
						answer = unitAmount * 20;
					}
				else if(endingUnit == 10)	//grams
					{
						answer = unitAmount * 1016000;
					}
				else if(endingUnit == 11)	//carats
					{
						answer = (long) (unitAmount * 5080000);
					}
				else if(endingUnit == 12)	//milligrams
					{
						answer = (long) (unitAmount * 1016000000);
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
//												if(answer >= Long.MAX_VALUE)
//													{
//														NumberFormat bigNumber = new DecimalFormat();
//														bigNumber = new DecimalFormat("0.######E0");
//														System.out.println(unitAmount + " " + units[startingUnit - 1] + " converts to " + bigNumber.format(answer) + " " + units[endingUnit - 1]);
//													}
												//else
													//{
														System.out.println(unitAmount + " " + units[startingUnit - 1] + " converts to " + answer + " " + units[endingUnit - 1]);
													//}
											}
									}
							}
						
					}
				
			}
		
		
	}
