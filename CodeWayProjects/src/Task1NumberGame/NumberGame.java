package Task1NumberGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int minRange =1;
		int maxRange =100;
		int maxAttempts=5;
		int score =0;
		System.out.println("Welcome to the Number Guesssing Game!");
//		int generateNumber = random.nextInt(maxRange-minRange)+minRange;
//		System.out.println(generateNumber );
		do
		{
			int generateNumber = random.nextInt(maxRange-minRange)+minRange;
			System.out.println(generateNumber );
			int attempts =0;
			int userGuess;
			System.out.println("I've Selected a number betwwen "+minRange+" and "+maxRange+" . Try to guess!");
			while(attempts <maxAttempts)
			{
				System.out.print("Enter Your guess: ");
				userGuess  = sc.nextInt();
				attempts++;
				if(userGuess == generateNumber)
				{
					System.out.println("Congratulations You guessed the correct number in "+attempts+" attempts.");
					score += maxAttempts-attempts+1;
					break;
					
				}
				else if(userGuess<generateNumber)
				{
					System.out.println("Too low! Try again.");
				}
				else
				{
					System.out.println("Too High! Try again. ");
				}
				if(attempts == maxAttempts)
				{
					System.out.println("Sorry, You've reached the maximum numbers of attempts. The correct number was : "+generateNumber);
					
				}
			}
			System.out.print("Do you want to play again? (yes/no): ");
			String playAgain = sc.next().toLowerCase();
			if(playAgain.equals("no"))
			{
				break;
			}
		}while(true);
		System.out.println("Thanks for Playing! Your Total Score is : "+score);
		sc.close();
	}

}
