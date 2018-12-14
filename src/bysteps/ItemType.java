/*************************************************************************************************************
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : ItemType.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document. 
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : This class creates an enum to pre-set 4 types of items: audio, visual, audio mobile, visual mobile.
 ************************************************************************************************************/

package bysteps;

// TODO: Auto-generated Javadoc
/**
 * The Enum ItemType.
 */
// It creates an enum to pre-set 4 types of items: audio, visual, audio mobile, visual mobile.
public enum ItemType {

	/** The audio. */
	AUDIO("AU"), 			/** The visual. */
			 // audio type
	VISUAL("VI"), 		
		 /** The Audio mobile. */
		 // visual type
	AUDIO_MOBILE("AM"),	
	/** The Visual mobile. */
	// audio mobile type
	VISUAL_MOBILE("VM"); 	// visual mobile type

	/** The code. */
	 //instance fields
	public final String code;
	
	/**
	 * Instantiates a new item type.
	 *
	 * @param code the code
	 */
	//enum consructor
	ItemType(String code){
		this.code = code;
	}	
}//end of ItemType






