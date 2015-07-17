// https://www.hackerrank.com/challenges/library-fine

import java.io.*;
import java.util.*;

public class Solution {
	
	public static final int DAY = 0;
	public static final int MONTH = 1;
	public static final int YEAR = 2;

	public static void main(String[] args){
		// Read date info
		Scanner sc = new Scanner(System.in);
		int[] actualDate = new int[3];
		int[] expectedDate = new int[3];

		for(int i = 0; i < 3; i++){
			actualDate[i] = sc.nextInt();
		}
		for(int i = 0; i < 3; i++){
			expectedDate[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println(calculateCharge(actualDate, expectedDate));
	}
	
	private static int calculateCharge(int[] actualDate, int[] expectedDate){
		// Not the same year
		if(actualDate[YEAR] > expectedDate[YEAR]){
			return 10000;
		} else if (actualDate[YEAR] < expectedDate[YEAR]){
			return 0;
		}
		
		// Not the same month
		if(actualDate[MONTH] > expectedDate[MONTH]){
			return 500 * (actualDate[MONTH] - expectedDate[MONTH]);
		} else if (actualDate[MONTH] < expectedDate[MONTH]){
			return 0;
		}
		
		// Not the same day
		if(actualDate[DAY] > expectedDate[DAY]){
			return 15 * (actualDate[DAY] - expectedDate[DAY]);
		}
		
		return 0;
	}
	
}