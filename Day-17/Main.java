// Day 17: More Exceptions
// https://www.hackerrank.com/challenges/30-more-exceptions/copy-from/180617573
import java.util.*;
import java.io.*;

//Write your code here
class Calculator {
    public int power(int n1, int n2) {
    
            if (n1 < 0 || n2 < 0) {
                throw new ArithmeticException("n and p should be non-negative");
            } else {
            double expo = Math.pow(Double.valueOf(n1 * 1), Double.valueOf(n2 * 1));
            int res = (int)expo;
            return res;
            }
        
    }
}
class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
