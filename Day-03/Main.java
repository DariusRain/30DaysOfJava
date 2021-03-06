// Day 3: Intro to Conditional Statements
// https://www.hackerrank.com/challenges/30-conditional-statements/copy-from/183184718
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        // If N is odd, print Weird
        if (N % 2 != 0) {
            System.out.println("Weird");
        }

        // If N is even and in the inclusive range of 2 to 5 print Not Weird
        if (N % 2 == 0 && 2 <= N && N <= 5) {
            System.out.println("Not Weird");
        }

        // If N is even and in the inclusive range of 6 to 20 print Weird
        if (N % 2 == 0 && 6 <= N && N <= 20) {
            System.out.println("Weird");
        }
        
        // If N is greater than 20 print Not Weird
        if (N % 2 == 0 && 20 < N) {
            System.out.println("Not Weird");
        }
        scanner.close();

    }
}
