package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		try {
			int x = 0;
			int y = 0;
			for (x = 0; x <= arr.length - 1; x++) {
				y += arr[x];
			}
			return y;
		} catch (NullPointerException e) {
			return 0;
		}

	}
}
