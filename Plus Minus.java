// https://www.hackerrank.com/challenges/plus-minus

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args){
		int numInputs;
		Scanner sc = new Scanner(System.in);
		numInputs = sc.nextInt();

		int temp;
		int numPos = 0;
		int numZero = 0;
		int numNeg = 0;
		for (int i = 0; i < numInputs; i++){
			temp = sc.nextInt();
			if (temp > 0){
				numPos++;
			} else if (temp < 0){
				numNeg++;
			} else {
				numZero++;
			}
		}
		
		System.out.println( ((double)numPos) / ((double)numInputs) );
		System.out.println( ((double)numNeg) / ((double)numInputs) );
		System.out.println( ((double)numZero) / ((double)numInputs) );
		sc.close();
	}
	
}