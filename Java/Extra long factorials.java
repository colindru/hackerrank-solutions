// https://www.hackerrank.com/challenges/extra-long-factorials

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		BigInteger bigInt = BigInteger.valueOf(num);
		
        System.out.println(factorial(bigInt).toString());
	}
	
	private static BigInteger factorial (BigInteger num){
		// Base case: return 1
		if (num.equals(BigInteger.ONE)) { return num; }
		
		// Recursive case: return n * n-1
		return num.multiply(
			factorial(num.subtract(BigInteger.ONE))
		);
	}
}