/*************************************************************************************************************
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : ScreenDriver.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document. 
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : This class tests the Screen class.
 ************************************************************************************************************/

package bysteps;

// TODO: Auto-generated Javadoc
/**
 * The Class ScreenDriver.
 */
public class ScreenDriver {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Screen screenTest1 = new Screen("1024X768",120,10);
		System.out.println(screenTest1);
	}
}//end of ScreenDriver
