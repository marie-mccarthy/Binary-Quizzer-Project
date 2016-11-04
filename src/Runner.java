import java.util.ArrayList;
import java.util.Scanner;

public class Runner
	{
		public static void main(String[] args)
		{			
			int points = 0;
			int i = 0;
			int number1 = 0;
			
			ArrayList<Integer>numbers = new ArrayList <Integer>();				
			boolean input= true;
			System.out.println("Input as many different ints as you want between -1 and 20");
			while (input)
				{					
					//Collections.sort(myArray)
					Scanner userInput= new Scanner(System.in);
					number1 = userInput.nextInt();
					numbers.add(number1);					
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
			int left = 0;
			int pass = 1;
			int right = numbers.size() - 1;
			int random=(int)(Math.random()*numbers.size())+0;
			int target = (int) numbers.get(random);
			while(left<= right)
			{
			System.out.println("Here is the array:");
			for(int a = 0 ; a< numbers.size() ; a ++)
				{
					System.out.print("  " + numbers.get(a));
				}
			System.out.println();
			for(int b = 0 ; b< numbers.size() ; b ++)
				{
					System.out.print("  "+b);
				}
			
			System.out.println();
			System.out.println("The target is : "+numbers.get(random)+" at the "+random );
			System.out.println("Pass:"+pass);
//right
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
//left					
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
//middle
					System.out.println("What is the Middle?");
					int mid = (right+left)/2;
					Scanner userInput3= new Scanner(System.in);
					int guessMid = userInput2.nextInt();
					if(guessMid == mid)
						{
							System.out.println("correct");
							points++;
						}
					else
						{
							System.out.println("Sorry the correct anwser was "+mid);
						}
					System.out.println("You have "+points+" points");
//array[middle]
					System.out.println("What is the value at the Middle?");

					Scanner userInput4= new Scanner(System.in);
					int guessMiddleNumber = userInput2.nextInt();
					if(guessMiddleNumber == numbers.get(mid))
						{
							System.out.println("correct");
							points++;
						}
					else
						{
							System.out.println("Sorry the correct anwser was "+numbers.get(mid));
						}
					System.out.println("You have "+points+" points");
										
					if(target == numbers.get(mid))
						{
						System.out.println("Quiz Over");
						input = false;
						}
					if(target< numbers.get(mid))
						{
							right = mid -1;
						}
					else
						{
							left = mid+1;
						}
					
					System.out.println("Woud you like to continue?");
					Scanner userInput= new Scanner(System.in);
					String stillPlaying = userInput.nextLine();
					if(stillPlaying.equals("no"))
					{
						System.out.println("Ok. Goodbye.");
						System.exit();
					}
				}
		}
	}			