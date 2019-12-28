package j_interface;

public class SBI extends GovernmentBank implements Bank, Branch {

	//
	public void welcome(){
		System.out.println("Welcome to SBI Bank");
	}
	
	public void location(){
		System.out.println("Mumbai Suburban Branch");
	}
	
	//
	public void workingHrs(){
		System.out.println("9:30 AM to 5:00 PM");
	}
	
	//
	public float rateOfInterest(){
		return 8;
	};
	
	//
	public int amb(){
		return 5000;
	}
	
}
