// https://www.hackerrank.com/challenges/caesar-cipher-1
// Used Java code sample from http://rosettacode.org/wiki/Caesar_cipher

import java.io.*;
import java.util.*;

public class Solution {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int stringLength = sc.nextInt();	// (Unused)
		sc.nextLine();
		String uncypheredString = sc.nextString();
		int charOffset = sc.nextInt();
		sc.close();

        StringBuilder encoded = new StringBuilder();
        for (char ch : uncypheredString.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    encoded.append((char) ('A' + (ch - 'A' + charOffset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (ch - 'a' + charOffset) % 26 ));
                }
            } else {
                encoded.append(ch);
            }
        }
		
        System.out.println(encoded.toString());
	}
	
}