//  Day 28: RegEx, Patterns, and Intro to Databases
// https://www.hackerrank.com/challenges/30-regex-patterns/problem

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
        List<String> peopleWithGmails = new ArrayList<>();
        Pattern patternName = Pattern.compile("^[a-z]{1,20}$");
        Pattern patternEmail = Pattern.compile("^([a-z]*)@([a-z]*)gmail\\.com$");
        Matcher matcherName; 
        Matcher matcherEmail;

        for (int NItr = 0; NItr < N; NItr++) {
                String[] firstNameEmailID = scanner.nextLine().split(" ");

                String firstName = firstNameEmailID[0];

                String emailID = firstNameEmailID[1];

                matcherName = patternName.matcher(firstName);
                matcherEmail = patternEmail.matcher(emailID);

                if(matcherName.find() && matcherEmail.find()) {
                    peopleWithGmails.add(firstName);
                }

        }
        
        peopleWithGmails.stream().sorted().forEach(name -> {
            System.out.println(name);
        });


        scanner.close();

    }
}
