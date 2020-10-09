// Day 13: Abstract Classes
// https://www.hackerrank.com/challenges/30-abstract-classes/copy-from/180596900
import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
class MyBook extends Book  {  
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    private int price;
    // Write your constructor here
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);

    }   
// End class
}
public class Solution {