/**
 *@author Mohamed Attia
 *@version 3.0
 * @see Patient
 * @since 1.8
*/
import java.util.Scanner;

/**
 * 
 * The MyHealthDataTest class is used to test the functionality of the Patient class.
 * 
 * 
 * it allows the user to input the patient year of birth only as positive number.
 * it does not accept letters or negative numbers.
 * if the user is trying to input any String or negative number, they will see an error message and they
 * will have to  enter it again. Until the enter the right format, the program continue will to the next step. 
 * 
 * 
 * it allows the user to input the patient month of birth only as positive number.
 * it only accept values from 1-12 as there are only 12 months in a year 
 * if the user is trying to input a positive number that less than 1 or greater than 12, they will fine an error message
 * and they have to enter it again  
 * 
 * 
 * it allows the user to input the patient day of birth only as positive number.
 * it only accept values from 1-31 as there are maximum 31 days in a month
 * if the user is trying to input a positive number that less than 1 or greater than 31, they will fine an error message
 * and they have to enter it again in the right format.
 * 
 *
 * it allows the user to input the patient height only as positive number.
 * 
 * 
 * it allows the user to input the patient weight only as positive number.
 */
public class MyHealthDataTest {
/**
 * The main method is the entry point of the program.
 * It prompts the user to enter the patient's information and performs tests on the getBMI() method.
 * @param args: The command-line arguments.
 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Prompt the user to enter the patient's information
		 System.out.print("Enter patient's first name: ");
	        String firstName = scan.nextLine();
	     // Prompt the user to enter the patient's first name
	        System.out.print("Enter patient's last name: ");
	        String lastName = scan.nextLine();
	     // Prompt the user to enter the patient's last name
	        System.out.print("Enter patient's gender: ");
	        String gender = scan.nextLine();
	     // Prompt the user to enter the patient's gender
	        

	        
//	        
//	          it allows the user to input the patient year of birth only as positive number.
//	          it does not accept letters or negative numbers.
//	          if the user is trying to input any String or negative number, they will see an error message and they
//	         will have to it enter it again. Until the enter the right format, the program continue will to the next step. 
//	         
	        int birthYear = 0;
	        while (birthYear <= 0) {
	            System.out.print("Enter patient's birth year: ");
	            if (scan.hasNextInt()) {
	                birthYear = scan.nextInt();
	                if (birthYear <= 0) {
	                    System.out.println("Invalid input. Please enter a positive integer for the birth year.");
	                }
	            } else {
	                System.out.println("Invalid input. Please enter a positive integer for the birth year.");
	                scan.nextLine(); // Clear the input buffer
	            }
	        }

	        
//	          it only accept values from 1-12 as there are only 12 months in a year 
//	          if the user is trying to input a positive number that less than 1 or greater than 12, they will fine an error message
//	          and they have to enter it again  
//	          it allows the user to input the patient month of birth only as positive number.
//	          it does not accept letters or negative numbers.
//	          if the user is trying to input any String or negative number, they will see an error message and they
//	          will have to it enter it again. Until the enter the right format, the program will continue to the next step.
//	         
	        int birthMonth = 0;
	        while (birthMonth <= 0 || birthMonth > 12) {
	            System.out.print("Enter patient's birth month: ");
	            if (scan.hasNextInt()) {
	                birthMonth = scan.nextInt();
	                if (birthMonth <= 0 || birthMonth > 12) {
	                    System.out.println("Invalid input. Please enter a positive integer between 1 and 12 for the birth month.");
	                }
	            } else {
		                System.out.println("Invalid input. Please enter a positive integer.");
		                scan.nextLine(); // Clear the input buffer
	            }	            
	        }

	        
//	          it only accept values from 1-31 as there are maximum 31 days in a month
//	          if the user is trying to input a positive number that less than 1 or greater than 31, they will fine an error message
//	          and they have to enter it again in the right format.
//	          it allows the user to input the patient day of birth only as positive number.
//	          it does not accept letters or negative numbers.
//	          if the user is trying to input any String or negative number, they will see an error message and they
//	          will have to it enter it again. Until the enter the right format, the program will continue to the next step.
	         
	        int birthDay = 0;
	        while (birthDay <= 0 || birthDay > 31) {
	            System.out.print("Enter patient's birth day: ");
	            if (scan.hasNextInt()) {
	                birthDay = scan.nextInt();
	                if (birthDay <= 0 || birthDay > 31) {
	                    System.out.println("Invalid input. Please enter a positive integer between 1 and 31 for the birth day.");
	                }
	            } else {
	                System.out.println("Invalid input. Please enter a positive integer .");
	                scan.nextLine(); // Clear the input buffer
	            }
	        }

	        
//	          it allows the user to input the patient height only as positive number.
//	          it does not accept letters or negative numbers.
//	          if the user is trying to input any String or negative number, they will see an error message and they
//	          will have it to enter it again. Until the enter the right format, the program will continue to the next step.
	         
	        double height = 0.0;
	        while (height <= 0.0) {
	            System.out.print("Enter patient's height (in inches): ");
	            if (scan.hasNextDouble()) {
	                height = scan.nextDouble();
	                if (height <= 0.0) {
	                    System.out.println("Invalid input. Please enter a positive number for the height.");
	                }
	            } else {
	                System.out.println("Invalid input. Please enter a positive number.");
	                scan.nextLine(); // Clear the input buffer
	            }
	        }

	        
//	          it allows the user to input the patient weight only as positive number.
//	          it does not accept letters or negative numbers.
//	          if the user is trying to input any String or negative number, they will see an error message and they
//	          will have it to enter it again. Until the enter the right format, the program will continue to give the result.
	         
	        double weight = 0.0;
	        while (weight <= 0.0) {
	            System.out.print("Enter patient's weight (in pounds): ");
	            if (scan.hasNextDouble()) {
	                weight = scan.nextDouble();
	                if (weight <= 0.0) {
	                    System.out.println("Invalid input. Please enter a positive number for the weight.");
	                }
	            } else {
	                System.out.println("Invalid input. Please enter a positive number.");
	                scan.nextLine(); // Clear the input buffer
	            }
	        }

	         
	        // instantiate Patient object
	        Patient patient = new Patient(firstName, lastName, gender, height, weight, birthYear, birthMonth, birthDay);

	        // Display patient's health data
	        patient.displayMyHealthData();
	        scan.close();

	}

}
