import java.util.ArrayList;
import java.util.Scanner;

public class Runner
	{
		public static <Int> void main(Int[] args)
		{			
			int points = 0;
			int i = 0;
			int number1 = 0;
			ArrayList<Int>numbers = new ArrayList <Int>();				
			boolean input= true;
			System.out.println("Input as many different ints as you want between -1 and 20");
			while (input)
				{					
					//Collections.sort(myArray)
					Scanner userInput= new Scanner(System.in);
					number1 = userInput.nextInt();
					numbers.add( number1, i);					
					if(number1>20)
						{
							number1 = 20;
						
							System.out.println("That number is too high. It will be changed to 20");
						}
					if(number1== -1)
						{
							System.out.println("you can not enter any more ints");				
							input = false;
						}
				i++;				
				}
//			prints out all the numbers
			for(int a = 0 ; a< numbers.size() ; a ++)
				{
					System.out.print("  " + numbers.get(a));
				}
			int random=(int)(Math.random()*numbers.size())+0;
			int target = (int) numbers.get(random);
			System.out.println();
			System.out.println("The target is : "+numbers.get(random));
			int left = 0;
			int right = numbers.size() - 1;
			while(left<= right)
				{
					int mid = (left+right)/2;
					if(target == numbers.get(mid))
						{
							return mid;
						}
					if(target< numbers.get(mid))
						{
							right = mid - 1;
						}
					else
						{
							left = mid-1;
						}
					System.out.println("What is the right?");
					Scanner userInput1= new Scanner(System.in);
					int guessRight = userInput1.nextInt();
					if(guessRight == right)
						{
							System.out.println("correct");
							points++;
						}
					else
						{
							System.out.println("Sorry the correct anwser was "+right);
						}
					
					System.out.println("What is the left?");
					Scanner userInput2= new Scanner(System.in);
					int guessLeft = userInput2.nextInt();
					if(guessLeft == left)
						{
							System.out.println("correct");
							points++;
						}
					else
						{
							System.out.println("Sorry the correct anwser was "+left);
						}
					System.out.println("You have "+points+"points");
				}
		}
	}			