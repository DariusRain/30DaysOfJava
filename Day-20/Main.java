// Day 20: Sorting
// https://www.hackerrank.com/challenges/30-sorting/copy-from/180793609
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // ArrayList<int> newArr = new ArrayList<>();
        int swaps = 0;
        for(int i = 0; i < n; i++) {
            // check if number is higher than current highest num;
            for(int j=0; j < a.length; j++) {
                if(j + 1 == a.length) {
                    continue;
                }
                if(a[j + 1] <= a[j]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    swaps+=1;
                }
            }

        }
        // Write Your Code Here
    
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);


    }
}
