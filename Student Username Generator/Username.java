

/**
 * Declaration of a Username class.
 *  This class has three private instance variables: FirstName, LastName, and StudentNumber
 */
public class Username {
private String FirstName;
private String LastName;
private long StudentNumber;

/**
 * @param firstNmae: the fist name of the user
 * @param lastName: the last name of the user
 * @param studentNumber: the student number of the user
 * Constructor for the Username class.
 *  The constructor initializes the instance variables FirstName, LastName, and StudentNumber with the values passed as parameters
 */
public Username(String firstNmae, String lastName, long studentNumber) {
	this.FirstName = firstNmae;
	this.LastName = lastName;
	this.StudentNumber = studentNumber;
	
}
/**
 * declaration of a public method named getFirstNmae() that returns a String.
 * The purpose of this method is to retrieve the value stored in the FirstName instance variable
 * @return FirstName : the fist name of the user
 * returns the value of the FirstName instance variable. 
 * When this method is called, it will return the current value stored in FirstName
 */
public String getFirstNmae() {
	return FirstName;
}

/**
 * declaration of a public method named setFirstNmae() that takes a String parameter firstNmae.
 *  The purpose of this method is to set the value of the FirstName instance variable
 * @param firstNmae : the fist name of the user
 * assigns the value of the firstNmae parameter to the FirstName instance variable.
 * The firstNmae parameter contains the new value that will be assigned to FirstName
 */
public void setFirstNmae(String firstNmae) {
	FirstName = firstNmae;
}

/**
 * declaration of a public method named getLastName() that returns a String.
 *  The purpose of this method is to retrieve the value stored in the LastName instance variable
 * @return LastName the last name of the user
 *  returns the value of the LastName instance variable.
 *  When this method is called, it will return the current value stored in LastName
 */
public String getLastName() {
	return LastName;
}

/**
 * declaration of a public method named setLastName() that takes a String parameter lastName. 
 * The purpose of this method is to set the value of the LastName instance variable
 * @param lastName the last name of the user
 * assigns the value of the lastName parameter to the LastName instance variable.
 * The lastName parameter contains the new value that will be assigned to LastName.
 */
public void setLastName(String lastName) {
	LastName = lastName;
}

/**
 * declaration of a public method named getStudentNumber() that returns a long data type.
 * The purpose of this method is to retrieve the value stored in the StudentNumber instance variable
 * @return StudentNumber: the student number of the user
 * returns the value of the StudentNumber instance variable
 * When this method is called, it will return the current value stored in StudentNumber
 */
public long getStudentNumber() {
	return StudentNumber;
}

/**
 * declaration of a public method named setStudentNumber() that takes a long parameter studentNumber.
 * The purpose of this method is to set the value of the StudentNumber instance variable
 * @param studentNumber: the student number of the user
 * assigns the value of the studentNumber parameter to the StudentNumber instance variable
 * The studentNumber parameter contains the new value that will be assigned to StudentNumber
 */
public void setStudentNumber(long studentNumber) {
	StudentNumber = studentNumber;
}

/**
 * public method called CreateUsername is created and it takes two parameters firstname and lastname of the type String and one parameters studentnumer of the type long. 
 * @param firstname: the first name of the user.
 * char is the data type for lastcharfirstname variable.
 * it retrieves the last character of the of the first name using charAt method and the expression firstname.length().
 * carAt method: returns the character at a specified index. 
 * expression firstname.length(): returns the length of the first name.
 * (firstname.length() - 1): subtracts 1 from the length of the first name will result in the index of the last character in the first name.
 * @see <a> https://www.w3schools.com/java/ref_string_charat.asp </a>
 * @see <a> https://www.javatpoint.com/java-string-length </a>
 * @since May 20, 2023
 * 
 * @param lastname :the last name of the user.
 * String is the data type for studentnumberdigits variable.
 * Converts the studentnumber value from long to a String to manipulate it as a string and perform string operations on it.
 * valueOf : converts different types of values into string.
 * substring method: returns a part of the string.
 * The substring method takes two parameters: the starting index (inclusive) and the ending index (exclusive). In this case, it extracts the characters from index 0 up to (but not including) index 3.
 * @see <a> https://www.javatpoint.com/java-string-valueof </a>
 * @see <a> https://www.javatpoint.com/java-string-substring </a>
 * @since May 20, 2023
 * 
 * @param studentnumber: the student number of the user 
 * String is the data type for firsthreeharsastame variable.
 * It extracts the first three characters of the lastname string using the substring method.
 * 
 * @return the values of the variables lastcharfirstname, studentnumberdigits, firsthreeharsastame.
 * this line combines the extracted parts of the variables, and returns them as a single String.
 */

public String CreateUsername() {
    char lastcharfirstname = FirstName.charAt(FirstName.length() - 1);
    String studentnumberdigits = String.valueOf(StudentNumber).substring(0, 3);
    String firstthreecharslastname = LastName.substring(0, 3);
    return lastcharfirstname + studentnumberdigits + firstthreecharslastname;
	}
}


