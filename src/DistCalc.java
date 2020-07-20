//**************************************************************************************************************

//  DistCalc.java		Author: Fischer
//
//Takes (x, y) coordinates for two points as input then computes the distance between them.
//**************************************************************************************************************
import java.util.Scanner;
import java.math.*;
import java.text.DecimalFormat;

public class DistCalc {

	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double distance;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first x coordinate:   ");
		x1 = scan.nextDouble();
		System.out.println("Please enter your first y coordinate:   ");
		y1 = scan.nextDouble();
		System.out.println("Please enter your second x coordinate:   ");
		x2 = scan.nextDouble();
		System.out.println("Please enter your second y coordinate:   ");
		y2 = scan.nextDouble();

		distance = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		// Round the output to three decimal places
		DecimalFormat fmt = new DecimalFormat("0.000");
		System.out.println("The distance from your two coordinates is " + fmt.format(distance) + " units.");

	}

}
