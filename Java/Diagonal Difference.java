// https://www.hackerrank.com/challenges/diagonal-difference

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int matrixSize = sc.nextInt();
		
		int lrDiagonalSum = 0;
		int rlDiagonalSum = 0;
		
		for (int i = 0; i < matrixSize; i++){
			for (int j = 0; j < matrixSize; j++){
                int temp = sc.nextInt();
                
                if (i == j)
                    lrDiagonalSum += temp;
                
                if ((i+j) == (matrixSize-1))
         			rlDiagonalSum += temp;
			}
		}
		
		int output = Math.abs(lrDiagonalSum - rlDiagonalSum);
		System.out.println(output);
		sc.close();
	}
	
}