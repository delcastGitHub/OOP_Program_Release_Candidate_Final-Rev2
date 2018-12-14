/***************************************************************************************************************
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : AudioPlayerDriver.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document. 
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : This class tests the AudioPlayer class, it prints the details to the console.
 ***************************************************************************************************************/

package bysteps;

// TODO: Auto-generated Javadoc
/**
 * The Class AudioPlayerDriver.
 */
//This class tests the AudioPlayer class, it prints the details to the console.
public class AudioPlayerDriver {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		//call overloaded constructor from AudioPlayer class
		AudioPlayer audioPlayerTest1 = new AudioPlayer("apple", "apple spec");
		audioPlayerTest1.play();
		audioPlayerTest1.stop();
		audioPlayerTest1.next();
		audioPlayerTest1.previous();
		
		System.out.println(audioPlayerTest1);	
	}// end of main
		
	//Instruction from professor :
	//Do not edit Main.
	/**
	 * Test audio player.
	 */
	//Reproduce this output (but with the current date and time, everything else should match exactly):
	public static void testAudioPlayer() {
		//call overloaded constructor from AudioPlayer class
				AudioPlayer audioPlayerTest2 = new AudioPlayer("iPop Mini", "MP3");
				audioPlayerTest2.play();
				audioPlayerTest2.stop();
				audioPlayerTest2.next();
				audioPlayerTest2.previous();
				System.out.println(audioPlayerTest2);
				
				AudioPlayer audioPlayerTest3 = new AudioPlayer("Walkman", "WAV");
				System.out.println(audioPlayerTest3);							
	}//end of testAudioPlayer
}//end of AudioPlayerTest


	
	
