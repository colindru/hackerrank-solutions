// https://www.hackerrank.com/challenges/time-conversion

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		sc.close();
		
		if(time.charAt(8) == 'A'){	// AM
			if(time.substring(0,2).equals("12")){	// Midnight
				System.out.println("00" + time.substring(2,8));
			} else {
				System.out.println(time.substring(0,8));				
			}
		} else {	// PM
			int hour = Integer.parseInt(time.substring(0,2));
			
			if (hour != 12){	// Add 12 to the hour unless it's noon
				hour += 12;
			}
			
			System.out.println(hour + time.substring(2,8));
		}
	}
	
}