//Friend Trinity Dickinson
//CIS 36B-61Y
//Professor Singh
//Assignment 2, Part 2
//Due: 10/20/2017

import java.lang.*;
import java.util.*;

public class Simulation
{
	private int heads, tails;
	private double hperc, tperc;
	public void simulate(Coin c, int times)
	{
		heads = 0;
		tails = 0;
		for (int i = 0; i < times; i++) {
			c.toss();
			System.out.printf("Side Up: %s%n", c.sideUp);
			if (c.sideUp.equals("heads")) { heads++; }
			if (c.sideUp.equals("tails")) { tails++; }
		}
		hperc = ((double)heads/times)*100;
		tperc = ((double)tails/times)*100;
		System.out.printf("Number of Heads: %d (%.2f%%) %nNumber of Tails: %d (%.2f%%)%n", heads, hperc, tails, tperc);
	}
}