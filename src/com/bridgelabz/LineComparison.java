package com.bridgelabz;
import java.util.Scanner;

/**
 * @author Sakshi Shetty
 * Purpose - To calculate the length of line using formula
 */

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc = new Scanner(System.in);
		/**
		 * @param x1 - First co-ordinate of x-axis
		 * @param x2 - Second co-ordinate of x-axis
		 */
		System.out.println("Enter the co-ordinates for x-axis of line");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		/**
		 * @param y1 - First co-ordinate of y-axis
		 * @param y2 - Second co-ordinate of y-axis
		 */
		System.out.println("Enter the co-ordinates for y-axis of line");
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		/**
		 * Calculating the length between two points of line using formula
		 */
		double lengthOfLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("The lenth of line is :" + lengthOfLine);
		sc.close();
	}
}