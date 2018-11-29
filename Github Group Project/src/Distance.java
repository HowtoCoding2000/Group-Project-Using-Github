import java.util.Scanner;

public class Distance
	{
		public static void main(String[] args)
			{
				distanceConvert();
			}
		public static void distanceConvert()
			{
				boolean keep = true;
				while(keep){
				System.out.println("Which unit you want to convert from?");
				System.out.println("1. Meter");
				System.out.println("2.Kilometer");
				System.out.println("3.Foot");
				System.out.println("4.Inch");
				System.out.println("5.Mile");
				
				Scanner userinput1 = new Scanner(System.in);
				int firstUnitPick = userinput1.nextInt();
				
				System.out.println("Key in the number");
				Scanner userinput2 = new Scanner(System.in);
				double number = userinput2.nextDouble();
				
				System.out.println("Which unit you want to convert to?");
				System.out.println("1. Meter");
				System.out.println("2.Kilometer");
				System.out.println("3.Foot");
				System.out.println("4.Inch");
				System.out.println("5.Mile");
				Scanner userinput3 = new Scanner(System.in);
				int secondUnitPick = userinput3.nextInt();
				
				if(firstUnitPick == 1){
					if(secondUnitPick == 1){
						System.out.println(number + " meters are equal to " + number + " meters");
					}
					
					else if(secondUnitPick == 2){
						System.out.println(number + " meters are equal to " + number/1000 + " kilometers");
					}
					
					else if(secondUnitPick == 3){
						System.out.println(number + " meters are equal to " + number*3.2808399 + " feet");
					}
					
					else if(secondUnitPick == 4){
						System.out.println(number + " meters are equal to " + number*39.3700787 + " inches");
					}
					
					else if(secondUnitPick == 5){
						System.out.println(number + " meters are equal to " + number*0.000621371192 + " miles");
					}
					
				}
				
				else if(firstUnitPick == 2){
					if(secondUnitPick == 1){
						System.out.println(number + " kilometers are equal to " + number*1000 + " meters");
					}
					
					else if(secondUnitPick == 2){
						System.out.println(number + " kilometers are equal to " + number + " kilometers");
					}
					
					else if(secondUnitPick == 3){
						System.out.println(number + " kilometers are equal to " + number*3280.8399 + " feet");
					}
					
					else if(secondUnitPick == 4){
						System.out.println(number + " kilometers are equal to " + number*39370.0787 + " inches");
					}
					
					else if(secondUnitPick == 5){
						System.out.println(number + " kilometers are equal to " + number*0.62137 + " miles");
					}
					
				}
				
				else if(firstUnitPick == 3){
					if(secondUnitPick == 1){
						System.out.println(number + " feet are equal to " + number*0.3048 + " meters");
					}
					
					else if(secondUnitPick == 2){
						System.out.println(number + " feet are equal to " + number*0.0003048 + " kilometers");
					}
					
					else if(secondUnitPick == 3){
						System.out.println(number + " feet are equal to " + number + " feet");
					}
					
					else if(secondUnitPick == 4){
						System.out.println(number + " feet are equal to " + number*12 + " inches");
					}
					
					else if(secondUnitPick == 5){
						System.out.println(number + " feet are equal to " + number*0.0001893939 + " miles");
					}
					
				}
				
				else if(firstUnitPick == 4){
					if(secondUnitPick == 1){
						System.out.println(number + " inches are equal to " + number*0.0254 + " meters");
					}
					
					else if(secondUnitPick == 2){
						System.out.println(number + " inches are equal to " + number*(2.54/10/10/10/10/10) + " kilometers");
					}
					
					else if(secondUnitPick == 3){
						System.out.println(number + " inches are equal to " + number*0.083 + " feet");
					}
					
					else if(secondUnitPick == 4){
						System.out.println(number + " inches are equal to " + number + " inches");
					}
					
					else if(secondUnitPick == 5){
						System.out.println(number + " inches are equal to " + number*(1.578/10/10/10/10/10) + " miles");
					}
					
				}
				
				else if(firstUnitPick == 5){
					if(secondUnitPick == 1){
						System.out.println(number + " kilometers are equal to " + number*1609.344 + " meters");
					}
					
					else if(secondUnitPick == 2){
						System.out.println(number + " kilometers are equal to " + number*0.609344 + " kilometers");
					}
					
					else if(secondUnitPick == 3){
						System.out.println(number + " kilometers are equal to " + number*5280 + " feet");
					}
					
					else if(secondUnitPick == 4){
						System.out.println(number + " kilometers are equal to " + number*63360 + " inches");
					}
					
					else if(secondUnitPick == 5){
						System.out.println(number + " kilometers are equal to " + number + " miles");
					}
					
				}
				
				
				
				System.out.println("Do you want to play again?");
				Scanner userinput4 = new Scanner(System.in);
				String again = userinput4.nextLine();
				
				if(again.equals("yes")){
					
				}
				else if(again.equals("no")){
					keep = false;
				}
				

			}
			}
			}
	
