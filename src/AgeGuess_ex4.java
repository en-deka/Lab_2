//**************************************************************************************************************

//AgeGuess_ex4.java		Author: Fischer
//
//Takes the user's name as input and has user guess an age in range 0 -100.
//**************************************************************************************************************
import java.util.Scanner;
import java.util.Random;
import org.apache.commons.lang3.StringUtils; 
public class AgeGuess_ex4 {

	public static void main(String[] args) {
		// Declares a new int variable num and initializes num to a random integer
		// between 0 and 100 (inclusive).
		int age;
		int age_Guess;
		String name = "";
		Random gen = new Random();
		age = gen.nextInt(101);
		Scanner scan = new Scanner(System.in);

		System.out.print("What is your name?  ");

		name = scan.next();
		name = StringUtils.capitalize(name);
		System.out.print("Hello " + name
				+ ". I am thinking of an age between 0 and 100.  Of which age do you think that I am thinking?  ");
		age_Guess = scan.nextInt();
		
		if (age_Guess >= 0 && age_Guess <= 100 && age_Guess != age){
				System.out.println("You guessed wrong!");
				System.out.println("Your guess was " + age_Guess + ". I was thinking about the age " + age + ".");
		}
		else {
			System.out.print("Please read directions and try again!");
			System.exit(0);}
	}
			
		}


