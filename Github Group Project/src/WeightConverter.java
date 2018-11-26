import java.util.*;

public class WeightConverter
	{
		static Scanner userInput;
		static String[] units = {"Pounds", "Kilograms", "Ounces", "Stones(UK)", "Metric Tons", "Pennyweights", "Grains", "Tons", "Hundredweights", "Grams", "Carots", "Milligrams", "Micrograms", "Imperial Tons(UK)"};    
		
		public static void main(String[] args)
		{
			userInput = new Scanner(System.in);
			greeting();
			result();
			
		}
		
		static int startingUnit;
		static int unitAmount;
		static int answer;
		static int endingUnit;

		private static void greeting()
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
						System.out.println("How many carots are you converting?");
						unitAmount = userInput.nextInt();
						Carots();
					}
				else if(startingUnit == 12)
					{
						System.out.println("How many milligrams are you converting?");
						unitAmount = userInput.nextInt();
						milligram();
					}
				else if(startingUnit == 13)
					{
						System.out.println("How many micrograms are you converting?");
						unitAmount = userInput.nextInt();
						microgram();
					}
				else if(startingUnit == 14)
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

		private static void Carots()
			{
				// TODO Auto-generated method stub
				
			}

		private static void milligram()
			{
				// TODO Auto-generated method stub
				
			}

		private static void microgram()
			{
				// TODO Auto-generated method stub
				
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
						
					}
				else if(endingUnit == 3)	//ounces
					{
						
					}
				else if(endingUnit == 4)	//stones
					{
						
					}
				else if(endingUnit == 5)	//metric tons
					{
						
					}
				else if(endingUnit == 6)	//pennyweights
					{
						
					}
				else if(endingUnit == 7)	//grains
					{
						
					}
				else if(endingUnit == 8)	//tons
					{
						
					}
				else if(endingUnit == 9)	//hundredweights
					{
						
					}
				else if(endingUnit == 10)	//grams
					{
						
					}
				else if(endingUnit == 11)	//carots
					{
						
					}
				else if(endingUnit == 12)	//milligrams
					{
						
					}
				else if(endingUnit == 13)	//micrograms
					{
						
					}
				
				
			}
		
		private static void result()
			{
				for(int i = 0; i < units.length; i++)
					{
						if(i == startingUnit)
							{
								for(int j = 0; j < units.length; j++)
									{
										if(j == endingUnit)
											{
												
											}
									}
							}
						
					}
				
			}
		
		
	}
