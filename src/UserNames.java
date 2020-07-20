//**************************************************************************************************************

//  UserNames.java		Author: Fischer
//
// Takes input for user's first and last name; then prints a string composed of the first 4 letters of the
// user's last name, followed by the first letter of the user's first name, followed by a random number in the
// range of 10 to 99 (inclusive).
//**************************************************************************************************************

import java.util.Scanner;
import java.util.Random;

public class UserNames {

	public static void main(String[] args) {

		int num;
		String fname = "";
		String lname = "";
		Scanner scan = new Scanner(System.in);

		System.out.print("What is your first name?  ");
		fname = scan.next();
		System.out.print("What is your last name?   ");
		lname = scan.next();

		Random gen = new Random();
		num = 10 + gen.nextInt(90);

		System.out.println("Your username is " + lname.substring(0, 4) + fname.substring(0, 1) + num + ".");

	}

}
