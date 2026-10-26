package Day4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Rock Paper Scissor game");
		
		//User Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("0: Rock, 1: Paper, 2: Scissors");
		int userChoice = scanner.nextInt();
		System.out.println("User choice is: " + userChoice);
		
		//validate input - user's choice
		
		if (userChoice<0 || userChoice>2 ) {
			System.out.println("Invalid Choice. Please run the game again and enter 1 or 1 or 2");
			return;
		}
		
		Random random = new Random();
		//Genarate Computer's random choice between 0 and 2
		// Possible values: 0, 1, 2

		int computerChoice = random.nextInt(3); 
		System.out.println("Computer Choice is: " + computerChoice);

		//Determine the winner
		//Tie
		if (userChoice == computerChoice) {
			System.out.println("It is a tie");
		}
		// user to win
		else if((userChoice == 0 && computerChoice == 2) ||
				 (userChoice == 1 && computerChoice == 0) ||
				 (userChoice == 2 && computerChoice == 1)) 
		{
			System.out.println("Congrats you win!");
		}
		else {
			System.out.println("Comuter wins");
		}
		
		scanner.close();
	}

}
