import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args){
		int numInputs;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		numInputs = sc.nextInt();
		
		for (int i = 0; i < numInputs; i++){
			sum += (long)sc.nextInt();
		}
		
		System.out.println(sum);
		sc.close();
	}
	
}