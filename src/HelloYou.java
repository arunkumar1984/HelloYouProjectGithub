/**
 *   File Name: HelloYou.java<br>
 *
 *   Venkatraman, Arunkumar<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 19, 2016
 *   
 */

/**
 * HelloYou //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Venkatraman, Arunkumar
 * @version     1.0.0
 * @since       1.0
 *
 */
//import library to use Scanner object
import java.util.*;

//Class to get to know the user
public class HelloYou {
	// Create a class variable of a Scanner object to allow user input to
	// console
	static Scanner scanner = new Scanner(System.in);
	// Static class variable to hold string array for user info
	static String[] userVars;
	static String[] details;

	// Method tp say farewell to user
	public static void exitApplication() {
		// Message to say farewell to user
		System.out.println("\nThank you for using SQA Greeting Application!");
		// Exit the system
		System.exit(0);
	}

	public static void main(String[] args) {
		// Declare local variables
		String name;
		// Output a welcome message to user
		System.out.println("Hello, and welcome to SQA Selenium Boot Camp");
		// Request the user's name
		System.out.println("Could I please get your name? ");
		// Set the captured name to a local string variable, name
		name = scanner.nextLine();
		// Call method to get user input to set it to a variable which holds an
		// array of strings
		details = requestUserInfo(name, "age", "city of residence", "favourite color", "current mood");
		// Output the information to the user
		outputUserDetails(name);
		// Call method which gives a farewell to user and exists the sustem
		exitApplication();
	}

	public static void outputUserDetails(String name) {
		// Begin outputing user gathered details such as their name
		System.out.println("\nWell " + name + ", it seems I have learned enough about you.");
		// Iterate through user details backwards, each iteration echos a detail
		for (int i = userVars.length - 1; i > 0; i--) {
			// Echo detail gathered of user info and requested details to
			// console
			System.out.println("Your " + details[i] + " is " + userVars[i] + ",");
		}
	}

	// This is a method or function (Component that make up the method form a
	// method signature)
	public static String[] requestUserInfo(String name, String... details) {
		// Create an array of Strings type objects to hold values for user, size
		// is based on supplied arguments
		userVars = new String[details.length];
		// Greet the user
		System.out.println("I am excited to learn more about you " + name + "!");
		// Perform a loop for the amount of iterations equal to the length of
		// supplied items
		for (int i = 0; i < details.length; i++) {
			// For each iteration ask the user for details
			System.out.print("Can i get your " + details[i] + ", please? ");
			// Capture user input in relative variable within array
			userVars[i] = scanner.nextLine();
		}
		// return the string array of supplied details
		return details;
	}
}