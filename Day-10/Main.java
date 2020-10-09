// Day 10: Binary Numbers
// https://www.hackerrank.com/challenges/30-binary-numbers/copy-from/180522983
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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String binaryStr = Integer.toBinaryString(n);
        String ones = "1";
        while(true) {
            if (binaryStr.indexOf(ones) != -1) {
                ones += "1";
            } else {
                System.out.println(ones.length() - 1);
                break;
            }
        }
        scanner.close();
    }
}
