// Day 26: Nested Logic
// https://www.hackerrank.com/challenges/30-nested-logic/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    // Get Input
    Scanner input = new Scanner(System.in);
    ArrayList<String> inputArr = new ArrayList<String>();
    
    while(input.hasNextLine()) {
        inputArr.add(input.nextLine().trim());
    }
    // System.out.println(inputArr);
    for (int i = 0; i + 1 < inputArr.size(); i++) {
        String[] dateReturnedStr = inputArr.get(i).split(" ");
        String[] returnDateStr = inputArr.get(i + 1).split(" ");
        // System.out.println(Arrays.toString(dateReturnedStr));
        // System.out.println(Arrays.toString(returnDateStr));
        int j = 2;
        int fine = 0;
        while (0 <= j) {
            int dateReturnedNum = Integer.parseInt(dateReturnedStr[j]);
            int returnDateNum = Integer.parseInt(returnDateStr[j]);
            if (returnDateNum < dateReturnedNum) {
                // System.out.println(j);
                if (j == 2) {
                    fine = 10000;
                    break;
                }

                int fineQty = dateReturnedNum - returnDateNum;

                if (j == 1) {
                    fine = fineQty * 500;
                    break;
                }

                if (j == 0) {
                    fine = fineQty * 15;
                    break;
                }
            } else if (j == 2 && dateReturnedNum < returnDateNum) {
                break;
            }
            j-=1;
        }  
        System.out.println(fine);
        i += 1;
    }

    // Fines:
    // 15 X # of days if day
    // 500 X # of months if months
    // 1000 fixes if year or more
    }
}
    