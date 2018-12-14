/*************************************************************************************************************
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : Screen.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document. 
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : This class implements ScreenSpec interface, and it allows us to capture details of screen product. 				  
 ************************************************************************************************************/

package bysteps;


// TODO: Auto-generated Javadoc
/**
 * The Class Screen.
 */
//it sets details of a screen product. 	
public class Screen implements ScreenSpec {

	/** The screen resolution. */
	//instance variable to hold a String resolution specification of a screen
	private String screenResolution;
	
	/** The screen refresh rate. */
	//instance variable to hold a int refresh rate value of a screen
	private int screenRefreshRate;
	
	/** The screen response time. */
	//instance variable to hold a int response time value of a screen
	private int screenResponseTime;
	
    /**
     * This constructor set the screen specification (resolution, refresh rate and response time) to local variables.
     *
     * @param screenResolution the screen resolution
     * @param screenRefreshRate the screen refresh rate
     * @param screenResponseTime the screen response time
     * @param: screenResolution. It is the screen resolution of the product.
     * @param: refreshRate. It is the regresh rate of the screen of the product.
     * @param: responsetime. It is the response time of the screen of the procut.
     */
	public Screen (String screenResolution, int screenRefreshRate, int screenResponseTime) {
	
		this.screenResolution = screenResolution;
		this.screenRefreshRate = screenRefreshRate;
		this.screenResponseTime = screenResponseTime;	
	}
	
	/* (non-Javadoc)
	 * @see bysteps.ScreenSpec#getResolution()
	 */
	@Override
	public String getResolution() {
		return this.screenResolution;
	}

	/* (non-Javadoc)
	 * @see bysteps.ScreenSpec#getRefreshRate()
	 */
	@Override
	public int getRefreshRate() {
		return this.screenRefreshRate;
	}

	/* (non-Javadoc)
	 * @see bysteps.ScreenSpec#getResponseTime()
	 */
	@Override
	public int getResponseTime() {
		return this.screenResponseTime;
	}
	
	/**
	 * toString method will print  the screen's information.
	 *
	 * @return the string
	 * @return: information about the screen: resolution, refresh rate, and response time.
	 */
	public String toString() {
		
		return
				"Resolution:" + this.screenResolution + "\n"+
				"Refresh rate:"	+ this.screenRefreshRate + "\n"+
				"Response time:"	+ this.screenResponseTime;				
	}//end of toString
} // end of class Screen
