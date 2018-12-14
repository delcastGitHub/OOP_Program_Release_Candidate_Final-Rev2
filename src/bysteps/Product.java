/*************************************************************************************************************
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : Product.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document. 
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : This class implements the Item Interface and It will implement the basic characteristics and functionality 
 * 				  that all items on a production line should have.
 ************************************************************************************************************/
			
package bysteps;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Product.
 */
//It implements the basic characteristics and  functionality that all items on a production line should have.
public abstract class Product implements Item, Comparable<Product>{
	
	/** The serial number. */
	private int serialNumber;
	
	/** The manufacturer. */
	private String manufacturer;
	
	/** The manufactured on. */
	private Date manufacturedOn;
	
	/** The name. */
	private String name;
	
	/** The current production number. */
	//set the first producted item to 1
	private static int  currentProductionNumber =1;	
	
	
	/**
	 * This constructor sets the name of the product into local variables. Also, it sets a unique serial number 
	 * of the product, and increment the current production number for the next serial number. 
	 *
	 * @param name the name
	 * @param: name. It is the product's name.
	 */
	public Product(String name) {
		
		setName(name);
		setProductionNumber(currentProductionNumber );	
		serialNumber = currentProductionNumber;			// initialized poduction serial number "1"
		currentProductionNumber++;						// incremented in readiness for next production serial number
		manufacturer = manufacturerConst;				// initialized variable manufacturer to "oracleProduction"
		manufacturedOn = new Date();					//set manufacturedOn as the current date and time	
	}
	
	@Override
	public void setProductionNumber(int prodNumber) {
			
		currentProductionNumber = prodNumber;
		//System.out.println(prodNumber);
	}


	@Override
	public void setName(String name) {
		
		this.name=name;
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public Date getManufactureDate() {
		
		return manufacturedOn;
	}

	@Override
	public int getSerialNumber() {
		
		return serialNumber;
	}
	
	 /**
 	 * toString method will print information about the product.
 	 *
 	 * @return the string
 	 * @return: the  Manufacturer name
 	 * the serialNumber
 	 * the date when the product was manufactured
 	 * the name of the product
 	 */
	public String toString() {
		
		return 
				"Manufacturer : " + manufacturer + "\n"+
				"Serial Number : " + serialNumber + "\n"+
				"Date : " + manufacturedOn + "\n"+
				"Name : " + name;
	}
	
	 /**
 	 * compareTo method will compare if this.name is equal,<, or > 
 	 *
 	 * @param onpe the onpe
 	 * @return the int
 	 * @return: int 1 if it is equal
 	 */
	public int compareTo(Product onpe) {
			
		int respuesta;
		
		respuesta = this.name.compareTo(onpe.getName());
		
		return respuesta;
	}//end of compareTo	
	
} //end of product class
