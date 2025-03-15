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
			}

			else if (userChoice.equals("2")){
				System.out.println("Loading Computer Guesser...");
			}

			else {
				System.out.println("INVALID INPUT COMPUTER BLOWING UP IN 3... 2...");
				keepGoing = false;
			}
		}

		input.close();
	}
}





	     		
