package j_interface;

public class BankBazhar {

	public static void main(String[] args) {
		
		//SBI//
		SBI sbi = new SBI();
		
		//
		sbi.welcome();
		sbi.location();
		sbi.workingHrs();
	    System.out.println("We offiers "+sbi.rateOfInterest()+"% interest.");
	    System.out.println("We offiers "+sbi.amb()+" AMB");
	    sbi.BankType();
	    System.out.println("---------------------------------------------------");
		
		//ICICI//
	    ICICI icici = new ICICI();
		icici.welcome();
		icici.location();
		icici.workingHrs();
		System.out.println("We offiers "+icici.rateOfInterest()+"% interest.");
	    System.out.println("We offiers "+icici.amb()+" AMB");
	    icici.BankType();
	    System.out.println("---------------------------------------------------");
		
	    //PNB//
	    ICICI pnb = new ICICI();
		pnb.welcome();
		pnb.location();
		pnb.workingHrs();
		System.out.println("We offiers "+pnb.rateOfInterest()+"% interest.");
	    System.out.println("We offiers "+pnb.amb()+" AMB");
	    pnb.BankType();
	}

}
