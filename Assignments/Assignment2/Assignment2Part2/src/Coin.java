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
	
	public String getSideUp() {
		return sideUp;
	}
}