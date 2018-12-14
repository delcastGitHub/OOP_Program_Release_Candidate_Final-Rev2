/***************************************************************************************************************
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : Driver.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document. 
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : This class demostrates that any class that implements the MultimediaControl interface would be able to be
 * 				  instantiated and uses its methods used no matter if it was an audio or movie player
 **************************************************************************************************************/

package bysteps;

import java.util.List;

import java.util.ArrayList;
// TODO: Auto-generated Javadoc
//import java.util.Collections;


/**
 * The Class PlayerDriver.
 */
public class PlayerDriver {

	/**
	 * Prints the.
	 *
	 * @param list the list
	 */
	public static void print(List<Product> list) {
		
		for(Product prod:list) {
			System.out.println("\n"+prod);
		}
	}
		
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {	
		
		ArrayList<Product> list=new ArrayList<Product>();
		
		list.add(new AudioPlayer("audi player 3", "audio specification 3"));
	    list.add(new MoviePlayer("movie player 3"));
	      
	    list.add(new AudioPlayer("audio player 2", "audio specification 2"));
	    list.add(new MoviePlayer("movie player 2", new Screen("1024x768", 99,11), MonitorType.LED));
	      
	    list.add(new AudioPlayer("audio player 1", "audio specification 1"));
	    list.add(new MoviePlayer("movie player 1"));
	      
	    //Collections.sort(list);
	    //print(list);
	}
	
/**
 * Test player.
 */
public static void testPlayer() {	
		
		//call overloaded constructor from AudioPlayer class
		AudioPlayer audioPlayerTest1 = new AudioPlayer("", "");
	
		audioPlayerTest1.next();
		audioPlayerTest1.play();
		audioPlayerTest1.previous();
		audioPlayerTest1.stop();
		
		MoviePlayer audioPlayerTest2 = new MoviePlayer("");
		audioPlayerTest2.next();
		audioPlayerTest2.play();
		audioPlayerTest2.previous();
		audioPlayerTest2.stop();
		
	}
}//end of driver
