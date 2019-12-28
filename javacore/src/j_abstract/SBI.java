package j_abstract;

//SBI class derived from Abstract Bank class// 
public class SBI extends Bank{

	//
	void welcome(){
		System.out.println("Welcome to SBI Bank");
	}
	
	// 
	void workingHrs(){
		System.out.println("SBI working HRs 9:00AM to 5:00 PM");
	};
	
	//
	float rateOfInterest(){
		return 8;
	};
	
	//
	int amb(){
		return 10000;
	};
}
