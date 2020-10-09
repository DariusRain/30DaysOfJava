// Day 12: Inheritance
// https://www.hackerrank.com/challenges/30-inheritance/copy-from/180595581
import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate() {
        int avg = 0;
        int lengthOf = 0;
        for(int score: testScores) {
            avg += score;
            lengthOf += 1;
        }
        avg /= lengthOf;
        if (90 <= avg && avg <= 100) {
            return 'O';
        }
        if (80 <= avg && avg < 90) {
            return 'E';
        }
        if (70 <= avg && avg < 80) {
            return 'A';
        }
        if (55 <= avg && avg < 70) {
            return 'P';
        }
        if (40 <= avg && avg < 55) {
            return 'D';
        }
        if (avg < 40) {
            return 'T';
        }
        return 'T';
    }
}

class Solution {