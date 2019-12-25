package j_abstract;

//PNB class derived from Abstract Bank class// 
public class PNB extends Bank{
	
	//
	void welcome(){
		System.out.println("Welcome to PNB Bank");
	}
	
	// 
	void workingHrs(){
		System.out.println("PNB working HRs 9:00AM to 6:00 PM");
	};
	
	//
	float rateOfInterest(){
		return 9;
	};
	
	//
	int amb(){
		return 10000;
	};
}
