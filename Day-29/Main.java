// Day 29: Bitwise AND
// https://www.hackerrank.com/challenges/30-bitwise-and/problem

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
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            System.out.println(bitwise(n, k));
        }

        scanner.close();
    }

    static int bitwise(int x, int y) {
        int res = 0;
        int counter1 = 1;
        int counter2;
        while( counter1 <= x) {
            counter2 = counter1 + 1;
            while(counter2 <= x) {
                int temp = counter1 & counter2;
                if (temp > res && temp < y) {
                    res = temp;
                }
                counter2 += 1;
            }
            counter1 += 1;
        }
        return res;
    }
}
