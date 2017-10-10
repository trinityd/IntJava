//Friend Trinity Dickinson
//CIS 36B-61Y
//Professor Singh
//Assignment 2, Part 2
//Due: 10/20/2017

import java.lang.*;
import java.util.*;

public class Coin {
	public String sideUp;

	public Coin() {
		if (Math.random() > .5) { 
			sideUp = "heads"; 
		}
		else { 
			sideUp = "tails"; 
		}
	}
	
	public void toss() {
		if (Math.random() > .5) { 
			sideUp = "heads"; 
		}
		else { 
			sideUp = "tails"; 
		}
	}
	
	public void toss20Times() {
		int nHeads = 0;
		int nTails = 0;
		for (int i = 0; i < 20; i++) {
			this.toss();
			System.out.printf("Side Up: %s%n", this.sideUp);
			if (this.sideUp.equals("heads")) { nHeads++; }
			if (this.sideUp.equals("tails")) { nTails++; }
		}
		System.out.printf("Number of Heads: %d Number of Tails: %d%n", nHeads, nTails);
	}
	
	public String getSideUp() {
		return sideUp;
	}
}