package j_interface;

/*An interface is declared by using the interface keyword. 
It provides total abstraction; means all the methods in an interface are declared with the empty body, 
and all the fields are public, static and final by default.*/

//
public interface Bank {
	
	//
	void welcome();
	
	// method workingHrs
	void workingHrs();
	
	// method rateOfInterest //
	float rateOfInterest();
	
	//method average monthly balance //
	int amb();
}
