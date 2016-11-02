import java.util.ArrayList;
import java.util.Scanner;

public class Runner
	{
		public static void main(String[] args)
		{			
			int i = 0;
			ArrayList<String>numbers = new ArrayList <String>();				
			boolean input= true;
			System.out.println("Input as many ints as you want between -1 and 20");
			while (input = true)
				{					
					//Collections.sort(myArray)
					Scanner userInput= new Scanner(System.in);
					int number1 = userInput.nextInt();
					numbers.add(number1);					
//					if(number>20)
//						{
//							input = false;
//							System.out.println("That number is too high you can not enter any more numbers.");
//						}
					if(number1== -1)
						{
							input = false;
							System.out.println("you can not enter any more ints");							
						}
				i++;				
				}
			numbers.getNumber();
		}
	}			