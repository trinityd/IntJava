//Friend Trinity Dickinson
//CIS 36B-61Y
//Professor Singh
//Assignment 1, Part 2
//Due: 10/8/2017

import java.util.Scanner;

public class Part2 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Please enter an integer: ");
		long x = scan.nextLong();
		double xSquared = sqrt(x);
		System.out.printf("Babylonianly Squared: %.2f", xSquared);
		scan.close();
	}
	
	public static double sqrt(long n) {
		double lastGuess = 1;
		double nextGuess = (lastGuess + n / lastGuess) / 2;
		while (Math.abs(nextGuess-lastGuess) > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		return lastGuess;
	}
}