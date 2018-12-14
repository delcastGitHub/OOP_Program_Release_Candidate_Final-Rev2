/***************************************************************************************************************************
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : EmployeeInfo.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document. 
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : This class records which employee runs an audit trail on the production line. The information this class takes 
 * 			      from the employee are: employee ID, and employee's department ID. It will allows the user to type his first 
 * 				  name and surname. Then it will create a user id with the first letter of his name and surname. If there is not 
 * 				  space after his first name, the ID will be generated with the first letter of his name and a serial number of 
 * 				  1 digit. In addition to that, it will ask the user to enter his department's ID, and it will be compared with 
 * 				  the format: first uppercase letter with 3 lowercase letter and 2 numbers. If the department' ID is entered 
 * 				  correctly it will displays the Employee ID code, and the department ID in resverse order. If the Deparment ID 
 * 				  does not match the  format it will display "NONE01" as the department's ID 
 **************************************************************************************************************************/

package bysteps;

import java.util.Scanner;
import java.util.regex.*;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeInfo.
 */
//This class generates an employee ID code, and an reverse the employee's deparment ID.
public class EmployeeInfo {
	
	/** The name. */
	// variable to hold employee's first name and surname.
	private StringBuilder name;
	
	/** The code. */
	//variable to hold employee's ID code.
	private String code;
	
	// If there is not space after the employee's name the program will generates the employee's ID code
	/** The serial code. */
	//with the first letter of the name and the serialCode.
	//private static int  serialCode =1;	
	
	/** The dept id. */
	//to hold departement ID, 4 letters and 2 numbers. The first letter is uppercase and lowercase the next 3.
	private String deptId;
	
	/** The p. */
	//to hold information about the employee's department ID format.
	private Pattern p;
	
	/** The input. */
	private Scanner input;
	

	/**
     * This default constructor sets the employee's name, and the employee's deparment ID format.
     */
	public EmployeeInfo() {
		input = new Scanner(System.in);
		setName();
		p = Pattern.compile("^[A-Z][a-z]{3}[0-9]{2}$");
		setDeptID();
		input.close();
	}
	
	/**
	 * It gets the name and surname of the employee.
	 *
	 * @return the name
	 * @return:the employee's first name and surname.
	 */
	public StringBuilder getName() {
		
		return name;
	}
	
	/**
	 * It gets the employee's ID code.
	 *
	 * @return the code
	 * @return:the employee's ID code.
	 */
	public String getCode() {
		
		return code;
	}
	
	/**
     * It sets the employee's name and surname; alos, it calls the method to create the employee ID code.
     */
	public void setName() {
		
		String employeeName = inputName();
		
		// convert string name to StrngBuilder type
		name= new StringBuilder(employeeName); 
		
		createEmployeeCode(name);	
	}
	
	/**
	 * This method creates the ID by getting the first letter of the name and the surname.
	 * If not space found after the first name then it creates a generic ID with the first leeter of the name and a number.
	 *
	 * @param name the name
	 * @param: name: employee's name and surname.
	 */
	private void createEmployeeCode(StringBuilder name) {
		
		if(checkName(name)) {
			code=name.charAt(0) + name.substring(name.indexOf(" ") + 1);
		}
		else {
			//convert serial code to string
			//String optionalCode = Integer.toString(serialCode);	
			
			//get first letter of name and add the serial code as a string
			//code = name.charAt(0) + optionalCode;
			code = "guest";
			
			//increase serial code for next ID
			//serialCode++;										
		}//end of else
	}// end of crateEmployeeCode method
	
	/**
	 * This method askes the user to type his name and surname into the console.
	 *
	 * @return the string
	 * @return: the employee's name and surname.
	 */
	private String inputName() {
		
		System.out.print("Please enter your first and last name: ");
		//Scanner input = new Scanner(System.in);
		String employeeName = input.nextLine();
		//input.close();
		return employeeName;	
	}
	
	/**
	 * This method evaluates if the employee enter both: name and surname with a space in between.
	 *
	 * @param name the name
	 * @return true, if successful
	 * @param: name: employee's name and surname.
	 * @return: true if the there is a space in between name and surname; otherwise, it returns false.
	 */
	private boolean checkName(StringBuilder name) {
		
		//return true if there is a space between name and surname.
		if(name.indexOf(" ")>0) {
			return true;
		}
		else {
			return false;
		}//end of else	
	}// end of checkName
	
	/**
	 * Gets the dept ID.
	 *
	 * @return the dept ID
	 */
	//it gets the employee's department ID
	public String getDeptID() {
		
		System.out.print("Please enter the department ID: ");
		String id=input.nextLine();
		return id;
	}
	
	/**
	 * It validates the  employee's department ID, then reverse the ID code, and finally sets it to 
	 * deptId variable. if the departmen ID is not valid deptId will be set as None01. 
     */
	private void setDeptID() {
		
		String id= getDeptID();
		
		if(validID(id)) {
			this.deptId = reverseString(id);
		}
		else {
			this.deptId = "None01";
		}//end of else
	}// end of setDeptID
	
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	//It gets the employee department's ID.
	private String getID() {
		
		return this.deptId;
	}
	
	/**
	 * It validates the entered employee's department ID. If the ID is matches the  department ID format then it will return a true boolean value.
	 *
	 * @param id the id
	 * @return true, if successful
	 */
	private boolean validID(String id) {
		
		Matcher matcher = p.matcher(id);
		return matcher.matches();
	}
	
	/**
	 * Reverse string.
	 *
	 * @param id the id
	 * @return the string
	 */
	//It reverse tthe order of the text stored for the department ID as a way to incress security.
	private String reverseString(String id) {
		
		byte [] strAsByteArray = id.getBytes();
		byte [] reverseString = new byte [strAsByteArray.length];
		
		//reverse string
		for(int i=0; i<strAsByteArray.length; i++) {
			reverseString[i]=strAsByteArray[strAsByteArray.length -i-1];
		}
		return new String(reverseString);
		
	}//end of reverString
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	//It prints the employee ID code and the department ID code(reversed)
	public String toString() {
		return 
				"\nEmployee Code: " + code +
				"\nDepartment ID: " + deptId +
				"\n";
	}//end of toString	
}// end of EmployeeInfo class
