// https://www.hackerrank.com/challenges/encryption

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args){
		try {
			Scanner in = new Scanner(System.in);
			String message = in.nextLine();
			int messageLen = message.length();

			int rowLen = (int)Math.floor((double)Math.sqrt(messageLen));
			int colLen = (int)Math.ceil((double)Math.sqrt(messageLen));

			// May need 1 more row
			if(rowLen*colLen < messageLen){ rowLen++; }

			char[][] arr = new char[rowLen][colLen];

			// Copy message into array
			int charIndex = 0;
			for(int i = 0; i < rowLen; i++){
				for(int j = 0; j < colLen; j++){
					if(charIndex < messageLen){
						arr[i][j] = message.charAt(charIndex++);
					} else {
						// Fill with some char that's not in the message
						arr[i][j] = '*';
					}
				}
			}

			printMessage(arr, messageLen);

			in.close();
		} catch (Exception e){}
	}
	
	// Print encoded message from array
	public static void printMessage(char[][] arr, int messageLen){
		int charsPrinted = 0;
		for(int i = 0; i < arr[0].length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[j][i] != '*'){
					System.out.print(arr[j][i]);
				} else {
					break;
				}
			}
			System.out.print(" ");
		}
	}
}