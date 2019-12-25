package j_abstract;

public class BankBazar {

	public static void main(String[] args) {
		
		//SBI info
		Bank sbi = new SBI();
		
		//sbi.welcome();
		System.out.println("Welcome to SBI"); 
		
		//
		sbi.workingHrs();
		
		// 
		System.out.println("Rate of Interest is: "+sbi.rateOfInterest()+" %");
		
		//
		System.out.println("Rate of Interest is: "+sbi.amb()); 
		
		System.out.println("---------------------------------------------------");
		//PNB info
		Bank pnb = new PNB();
		System.out.println("Welcome to PNB"); 
		
		//
		pnb.workingHrs();
		
		// 
		System.out.println("Rate of Interest is: "+pnb.rateOfInterest()+" %");
		
		//
		System.out.println("Rate of Interest is: "+pnb.amb());
	}

}
