package com.revature.tier1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
	
	String temp = Long.toString(num);
	int sum = 0;
	int[] newGuess = new int[temp.length()];
	for (int i = 0; i < temp.length(); i++) {
		 newGuess[i] = temp.charAt(i) - '0';
		 sum += Math.pow(newGuess[i], newGuess.length);
		 
	}
		if(sum == num) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
