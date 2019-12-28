package j_interface;

public class ICICI extends PrivateBank implements Bank, Branch {

	//
	public void welcome(){
		
		//
		System.out.println("Wecome to ICIC Bank");
	}
	
	//
	public void location(){
		System.out.println("Greater Mumbai Branch");
	}
	
	//
	public void workingHrs() {
		// 
		System.out.println("9:30 AM to 6:30 PM");

	}

	//
	public float rateOfInterest() {
		// 
		return 9;
	}

	//
	public int amb() {
		// 
		return 10000;
	}

}
