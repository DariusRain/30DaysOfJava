// Day 25: Running Time and Complexity
// https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // Source:
        // https://stackoverflow.com/questions/5811151/why-do-we-check-up-to-the-square-root-of-a-prime-number-to-determine-if-it-is-pr

        /* 
        Sven Marnach:
        "If a number n is not a prime, it can be factored into two factors a and b:

        n = a * b

            Now a and b can't be both greater than the square root of n, since then the
        product a * b would be greater than sqrt(n) * sqrt(n) = n. So in any 
        factorization of n, at least one of the factors must be smaller than the square 
        root of n, and if we can't find any factors less than or equal to the square 
        root, n must be a prime."
 */
        // Input
        Scanner scan = new Scanner(System.in);
        
        // Get uneccessary length input, going to be using hasNext() method.
        scan.nextInt();

        // Initialize an arraylist to add the integers from Input
        ArrayList<Integer> inArray = new ArrayList<Integer>();

        // While there is another input
        while(scan.hasNext()) {
            // Use try catch to catch thrown exceptions from invalid input.
            try {
                // Try to scan for next Integer. --> Then add it to the ArrayList.
                inArray.add(scan.nextInt());
            } catch (NoSuchElementException e) {
                continue;
            }
        }
        // For each number from input
        for (Integer num: inArray) {
            // Get square root of number & check if num is greater than 1 
            // assign 3 so loop will go through. becuase 1 is Not prime.
           int sqrt = num > 1 ? (int)Math.floor(Math.sqrt(num)) : 3;

           // While sqrt of num is less than zero, perform math to find 
           // if each is divisible to num then subtract sqrt
           while (sqrt > 0) {

               // if sqrt is now reduced to 1 or num is 2 
               if (sqrt == 1 || num == 2) {
                   System.out.println("Prime");
                   break;
               }

               // if there is no remainder from num divided by sqrt-- or if num == 1
               if (num % sqrt == 0 || num == 1) {
                   System.out.println("Not prime");
                   break;
               }
               
               sqrt--;
           }

        }
        
    }
}
        // Did not pass time complexity. (On to different approach.)
        // Loop through each number and check if each number is prime.
        // for (Integer num: inArray) {
        //     if (num == 1) {
        //         System.out.println("Not prime");
        //         continue;
        //     }
        //     if (num == 2) {
        //         System.out.println("Prime");
        //         continue;
        //     }

        //     // Set counter to two all positive numbers have have remainder of 0 
        //     // if divided by 1
        //     int counter = 1;

        //     // While 2 + 1 durring each iteration is less than num
        //     while(counter++ < num) {

        //         // Debug ( Check calculations )
        //         // System.out.println(counter + "%" + num + " = " (num % counter));
                
        //         // If "num" is divisible by the counter wich is always equal to number 
        //         // in range of ( 2 <--> num ).  Means it is not prime. Also break loop.
        //         if (num % counter == 0) {
        //             System.out.println("Not prime");
        //             break;
        //         }

        //         // If the counter is one iteration away of equaling num then 
        //         // that means that it prime becuase non of the proir iterations
        //         // broke the loop.
        //         if (counter + 1 == num) {
        //             System.out.println("Prime");
        //             break;
        //         }

        //     }
        // }
