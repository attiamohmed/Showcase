

/**
 * allows us to read the user input from the console 
 */
import java.util.Scanner;

public class Driver {
	
/**
 * @param args is used to pass the values 
 * main method to promote the user to enter their first name, last name and student number.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * instance created called scan to facilitate the Scanner 
		 */
		Scanner scan = new Scanner(System.in);
		
/**
 * Print statements to tell the user to enter their last,first name and student number and to show the student user name.
 * line 1-6
 * (scan.nextLine),(scan.nextLong) are used to read the usre's name.
 * the user's input will be stored in the variables firstname,lastname and syudentnumer.
 * Line 7: String is the data type for the variable result and it's assigned to the return value of the method CreateUsername.
 * The method CreateUsername takes three parameters (firstname, lastname, studentnumber.
 * line 8: is a print statement and it displays the student user name followed by the value of result.
 * the method toLowerCase() is called on the value of result to convert the output into lower case letters.
 * 
 */
		
	System.out.print("Please enter your first name:");
	String firstname = scan.nextLine();
	System.out.print("Please enter your last name:");
	String lastname = scan.nextLine();
	System.out.print("Please enter your student number:");
	long studentnumber = scan.nextLong();
	Username user = new Username(firstname, lastname, studentnumber);
    String result = user.CreateUsername();
    System.out.println("Student Username Is: " + result.toLowerCase());
	scan.close();
			}

	}


