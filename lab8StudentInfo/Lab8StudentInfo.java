package lab8StudentInfo;

import java.util.Arrays;
import java.util.Scanner;


public class Lab8StudentInfo {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scnr = new Scanner(System.in);
	
	// create variables, Strings and arrays
	int studentID = 0;
	String[] studentFirstName = { "Ann", "Becky", "Cindy", "Debbie", "Eddie", "Frank", "Ginger", "Harold", "Jack", "Karen" };
	String[] studentLastName = { "Jones", "Carver", "Smith", "Davis", "Jones", "Bradbury", "Damos", "Jackson", "Johnson", "Wilson" };
	String[] studentHometown = { "Albion", "Lansing", "Detroit", "Ann Arbor", "Holland", "Kalamazoo", "Grand Rapids", "Troy", "Novi", "Detroit" };
	String[] studentHomeState = new String[10];
		Arrays.fill(studentHomeState, "MI");
	String[] studentFavoriteFood = { "Tacos", "Pizza", "Mexican", "French", "Italian", "Greek", "Steak", "Dessert", "Sushi", "Thai" };
	String cont = ("yes"), another = ("no");
	
	// print out class roster
	System.out.println("Welcome to our Java class. Our students are: ");
	for (int roster = 1; roster <= studentFirstName.length; roster++) {
		System.out.println(roster + ". " + studentFirstName[roster - 1]);
	}
	
	// master do loop for each student of interest
	do {
		// setting up try to test if they enter number outside of array range
		try {
			System.out.println("Which student would you like to learn more about? (enter corresponding number 1-10):");
			studentID = scnr.nextInt();
			System.out.println("Student " + studentID + " is " + studentFirstName[studentID - 1] + " " + studentLastName[studentID - 1] + ". ");
		}
			catch (Exception ex) {
				System.out.println("That student does not exist. Please try again. (enter a number between 1-10):");
				studentID = scnr.nextInt();
				if (studentID > 0 && studentID <= 10) {
				}
				else {
					System.out.println("That student does not exist. Please try again. (enter a number between 1-10):");
					studentID = scnr.nextInt();
				}
				System.out.println("Student " + studentID + " is " + studentFirstName[studentID - 1] + " " + studentLastName[studentID - 1] + ". ");
			}
		// internal do loop for information on individual student
		do {	
			System.out.print("What would you like to know about " + studentFirstName[studentID - 1] + "?");
			System.out.println(" (enter \"hometown\" or \"favorite\"):");
		
				String studentInfo = scnr.next();
				if (studentInfo.equals("hometown")) {
					System.out.println(studentFirstName[studentID - 1] + " is from " + studentHometown[studentID - 1] + ", " + studentHomeState[studentID - 1] + ". ");
				}
				else if (studentInfo.equals("favorite")) {
					System.out.println(studentFirstName[studentID - 1] + " most enjoys " + studentFavoriteFood[studentID - 1] + ". ");
				}
				else {
					System.out.println("That data does not exist. Please try again. (enter \"hometown\" or \"favorite\" ");
					studentInfo = scnr.nextLine();
				}
				
			System.out.println("Would you like to know more? (enter \"yes\" or \"no\"): ");
			cont = scnr.next();
		}
		while (cont.equals("yes"));
		
		System.out.println("Do you want to learn about another student?: (enter \"yes\" or \"no\"): ");
		another = scnr.next();
	}	
	while (another.equals("yes"));
	
	System.out.println("Thanks!");
				
	}
}
