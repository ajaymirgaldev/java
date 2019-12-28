/**
 * 
 */
package j_interface;

/**
 * @author ajay.mirgal
 *
 */
public class PNB extends PrivateBank implements Bank, Branch {
	
	public void welcome(){
		System.out.println("Wecome to PNB Bank!");
	}
	
	public void location(){
		System.out.println("South Mumbai Branch");
	}
	
	//
	public void workingHrs() {
		// 
		System.out.println("9:00 AM to 6:00 PM");
	}
	
	//
	public float rateOfInterest() {
		// 
		return 9.0f;
	}
	
	//
	public int amb() {
		// 
		return 10000;
	}

}
