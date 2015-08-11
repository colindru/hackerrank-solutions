// https://www.hackerrank.com/challenges/angry-professor

import java.io.*;
import java.util.*;

public class Solution {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numTestCases = sc.nextInt();
		
		for(int i = 0; i < numTestCases; i++){
			int numStudents = sc.nextInt();
			int cancelThreshold = sc.nextInt();
			int presentStudents = 0;
			
			for(int j = 0; j < numStudents; j++){
				if (sc.nextInt() <= 0)
					presentStudents++;
			}
			
			System.out.println(presentStudents < cancelThreshold ? "YES" : "NO");
			
		}

		sc.close();
	}
	
}