/**
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : MoviePlayerDriver.java
 * Description  : This class will test the class MoviePlayer and print information 
 */

package bysteps;

// TODO: Auto-generated Javadoc
/**
 * The Class MoviePlayerDriver.
 */
public class MoviePlayerDriver {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		MoviePlayer moviePlayerTest1 = new MoviePlayer("cambio");
		System.out.println(moviePlayerTest1);
	}
	
	/**
	 * Test movie player.
	 */
	/*
	 * Instructtion from professor:
	 * The test should accept any number of spaces after the colons. 
	 * The player driver should create 2 MultimediaControl objects, 
	 * an AudioPlayer and a MoviePlayer and then call all methods of each. 
	 */
	public static void testMoviePlayer() {
		MoviePlayer moviePlayerTest1 = new MoviePlayer("DBPOWER MK101");
		System.out.println(moviePlayerTest1);	
		
		MoviePlayer moviePlayerTest2 = new MoviePlayer("Pyle PDV156BK", new Screen("1366x768", 40,22), MonitorType.LED);
		System.out.println(moviePlayerTest2);	
	
	}
}//end of MoviePlayerDriver
