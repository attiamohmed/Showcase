

/**
 *Calculates the average number of patients in a specific province.
 */
public class CovidStatistics {
	
	/**
	 * 
	 * @param patients is a 2D array that shows the number of patients on each day and in each province.
	 * @param R =Row (province) the province's index, using which the average will be determined.
	 * @return the average number of patients in the specified province
	 * 
	 * 
	 * What the code does:
	 * The aveByProvince method uses a 2D array of patient data to determine the typical number of patients in a given province.
	 * 
	 * 
	 * What the code doesn't do:
	 * It doesn't deal with errors or exceptions like an empty patient record or an invalid province index.
	 * Other statistics like maximum, minimum, or median cannot be computed using this functionality.
	 * No input validation or data preprocessing is done by it.
	 * Province is referred as (R) which is ROWS and month is referred to as (C)which is COLUMN
	 */
	public static int aveByProvince(int[][] patients, int R) {
	// Variable to store the sum of values in the row
        int sum = 0;
    // Go through each column in the chosen row iteratively.
        for (int C = 0; C < patients[R].length; C++) {
    // Add the value of each element to the sum
            sum += patients[R][C];
        }
    //Divide the sum by the number of elements in the row to determine and return the average.
        return sum / patients[R].length;
    }
/**
 * 
 * @param args is used to pass the values
 * The number of patients in each province for each month is printed in a table.
 * Each row in the data's 2D array corresponds to a province, and each column to a month.
 * The program also calculates and displays the average number of patients for each province.
 * 
 * The patient data and province names are initialized in arrays in the main method.
 * The patient count for each month and province is then printed in a table.
 * The table has a column for the typical number of patients for each province over all months.
 */
public static void main(String[] args)
 {
   final int ROWS = 7;
   final int COLUMNS = 8;

//Initialize patient information over several months for various provinces.
   int[][] patients = 
      { 
         {  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
         {  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
         {  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
         {  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
         {  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
         {  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
      {  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }
         
      };

// Initialize province names
   String[] provinces = 
      { 
         "Ontario             ", 
         "Quebec              ", 
         "Nova Scotia         ",
         "New Brunswick       ", 
         "Manitoba            ", 
         "British Columbia    ",
	     "Prince Edward Island"         
      };
// Display the table header
   System.out.println("Month                   Feb     March   April   May     June    July    Aug     Sept    Ave");
   System.out.println();

  
  /**
   *This code is in charge of displaying patient data by province and figuring out the average number of patients per province.
   *The province names, patient counts for each column, and average patient counts for each province are printed as
   *the program iterates through the array of provinces and patients. 
   *
   *What the code does:
   *1. runs through each province in the array of provinces.
   *2. uses the printf() method to print the province's name with a field width of 17.
   *3. iterates through each category in the current province's patients array.
   *4. uses the printf() method with an 8-pixel field width to print the number of patients for each category.
   *5. Calculates the average patient count for the current province by calling the aveByProvince() method.
   *6. uses the printf() method and a field width of 8 to print the average number of patients, followed by a newline character.
   *
   *What the code doesn't do:
   *1. It does not offer the aveByProvince() method's implementation.
   * To determine the average patient count for each province, you must define the aveByProvince() method separately.
   *2. It does not define or initialize the variables provinces, patients, ROWS, and COLUMNS.
   * You need to ensure they are defined and initialized before running this code
   */
// Display the number of patients in each province and calculate the average for each province
   for (int R = 0; R < ROWS; R++) {
	// Display the province name
       System.out.printf("%17s", provinces[R]);
    // Display the number of patients for each month
       for (int C = 0; C < COLUMNS; C++) {
           System.out.printf("%8d", patients[R][C]);
       }
    // Calculate and display the average number of patients for the province
       int average = aveByProvince(patients, R);
       System.out.printf("%8d%n", average);
   }
    
   
// Display a header for recovered patients
   System.out.println();
   System.out.print("Recovered Patients   ");

   /**
    * This code calculates the sum of each column in a two-dimensional array named patients.
    * It iterates over each column, summarizing the values, and then iterating over each row contained within that column.
    * Using the printf() function, the sum of each column is displayed.
    * 
    * What the code does:
    * 1. The inner loop computes the sum of the values in each column by iterating over each row and adding the values in the'sum' variable.
    * 2. The sum of each column is printed using System.out.printf, formatting the output to be displayed with a width of 8 characters.
    * 3. The outer loop iterates over each column in the two-dimensional 'patients' array.
    * 
    * What the code doesn't do:
    * 1. The code snippet makes the assumption that the "patients" array exists, but it makes no attempt to explain how the array is made or filled with data.
    * 2. The code does not define the values of the variables ROWS and COLUMNS, which represent the dimensions of the 'patients' array.
    */
   for (int C = 0; C < COLUMNS; C++) {
	// Initialize the variable 'sum' to zero for each column
       int sum = 0;
       for (int R = 0; R < ROWS; R++) {
    	// Add the value at index [R][C] to 'sum'
           sum += patients[R][C];
	   }
    // Print the sum of the column with a width of 8 characters
	   System.out.printf("%8d", sum);
	}

// Move to the next line after printing the sums of all columns
   System.out.println(); 
// Print an empty line for visual separation
   System.out.println(); 
   System.out.println("Vaccinate and maintain good health practices!");
}
}





   
   
   
   
   





