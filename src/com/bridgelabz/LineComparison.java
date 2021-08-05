package com.bridgelabz;
import java.util.Scanner;

/**
 * @author Sakshi Shetty
 * Purpose - To calculate the length and compare equality of lines using java equals method
 */

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc = new Scanner(System.in);
		/**
		 * Co-ordinates of first line 
		 * @param x1 - First co-ordinate of x-axis
		 * @param x2 - Second co-ordinate of x-axis
		 */
		System.out.println("Enter the co-ordinates for x-axis of first line");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		/**
		 * @param y1 - First co-ordinate of y-axis
		 * @param y2 - Second co-ordinate of y-axis
		 */
		System.out.println("Enter the co-ordinates for y-axis of first line");
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		/**
		 * Calculating the length between two points of first line using formula
		 */
		double lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("The lenth of first line is :" + lengthOfLine1);

		/**
		 * Co-ordinates for second Line 
		 * @param x3 - First co-ordinate of x-axis
		 * @param x4 - Second co-ordinate of x-axis
		 */
		System.out.println("Enter the co-ordinates for x-axis of second line");
		int x3 = sc.nextInt();
		int x4 = sc.nextInt();
		/**
		 * @param y3 - First co-ordinate of y-axis
		 * @param y4 - Second co-ordinate of y-axis
		 */
		System.out.println("Enter the co-ordinates for y-axis of second line");
		int y3 = sc.nextInt();
		int y4 = sc.nextInt();
		/**
		 * Calculating the length between two points of second line using formula
		 */
		double lengthOfLine2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("The lenth of second line is :" + lengthOfLine2);

		/**
		 * Checking whether both the lines are of same length or different length using java equals method
		 */

		Double length1 = Double.valueOf(lengthOfLine1);
		Double length2 = Double.valueOf(lengthOfLine2);

		if (length1.equals(length2))
			System.out.println("Both lines are of same length");
		else
			System.out.println("Both the lines are of different length");
		sc.close();
	}
}