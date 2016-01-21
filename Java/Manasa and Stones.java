import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCases = in.nextInt();
        
        for(int i = 0; i < numCases; i++){
            int numStones = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            
            printValues(numStones, a, b);
        }
    }
    
    static void printValues(int numStones, int a, int b){
        if(a > b){
            // Let a be the smaller value
            int temp = a;
            a = b;
            b = temp;
        } else if(a == b){
            // Only one possibility
            System.out.println(a*(numStones - 1));
            return;
        }
        
        for(int i = 0; i < numStones; i++){
            int finalStone = a*(numStones - i - 1) + b*i;
            System.out.print(finalStone + " ");
        }
        
        System.out.println();
    }
}