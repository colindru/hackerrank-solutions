// https://www.hackerrank.com/challenges/staircase

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		sc.close();

		for(int i = 1; i < height+1; i++){
			int j = 0;
			while(j < height-i){
				System.out.print(" ");
				j++;
			}
			
			while(j < height){
				System.out.print("#");
				j++;
			}
			
			System.out.println();
		}
	}
	
}