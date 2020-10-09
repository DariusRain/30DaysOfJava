// Day 6: Let's Review
// https://www.hackerrank.com/challenges/30-review-loop/copy-from/183188181
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numberOfTestCases = Integer.parseInt(scan.nextLine());
        while(scan.hasNextLine()) {
            String S = scan.nextLine();
            String left = "";
            String right = "";
            for (int i = 0; i < S.length(); i++) {
                if (i % 2 == 0) {
                    left += S.substring(i, i + 1);
                } else {
                    right += S.substring(i, i + 1);
                }
            }
            System.out.println(left + " " + right);
            left = "";
            right = "";
            numberOfTestCases -= 1;
        }
        scan.close();
    }
}