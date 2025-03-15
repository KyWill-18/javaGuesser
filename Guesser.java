import java.util.*;

public class Guesser {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;
		while (keepGoing){
			System.out.println("Menu:");
			System.out.println("0) Exit");
			System.out.println("1) Human Guesser");
			System.out.println("2) Computer Guesser");
			System.out.println("Please enter 0, 1, or 2: ");

			String userChoice = input.nextLine();

			if (userChoice.equals("0")){
				System.out.println("Goodbye!");
				keepGoing = false;
			}

			else if (userChoice.equals("1")){
				System.out.println("Loading Human Number Guesser...");
				humanGuesser();
			}

			else if (userChoice.equals("2")){
				System.out.println("Loading Computer Number Guesser...");
			}

			else {
				System.out.println("INVALID INPUT COMPUTER BLOWING UP IN 3... 2... 1...");
				keepGoing = false;
			}
		}

		input.close();
	}


	public static void humanGuesser(){
		int tries = 0;
		int correctNum = (int)(Math.random() * 100 + 1);
		boolean keepGoing = true;
		Scanner input = new Scanner(System.in);

		while (keepGoing){
			tries += 1;
			System.out.println("Guess a number 1 - 100: ");
			String userGuess = input.nextLine();

			try{
				int intUserGuess = Integer.parseInt(userGuess);

				if (intUserGuess > correctNum){
					System.out.println("Oh no! Too High!");
				}

				else if (intUserGuess < correctNum){
					System.out.println("Oh no! Too Low!");
				}

				else if (intUserGuess == correctNum){
					System.out.println("Good Job! You guessed the right number!");
					keepGoing = false;
				}

			}

			catch (NumberFormatException e) {
				System.out.println("INVALID INPUT! PLEASE ENTER A VALID  NUMBER!");
			}
		}
		
		input.close();
	}
}	
