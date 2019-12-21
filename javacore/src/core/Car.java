/**
 * 
 */
package core;

import java.util.Scanner;

/**
 * @author ajay.mirgal
 *
 */
public class Car {

	private String carColor;
	
	
	//Class parameterized constructor//
	Car(String color){
		
		//Set car color//
		this.carColor = color;
	}
	
	//Setter
	public void setCarDetails(String color){
		
		//
		carColor = color;
		
	}
	
	//Getter
	public void getCarDetails(){
		System.out.println("Your Car Details as follows: "+carColor);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Instantiating Car class //
		Car car = new Car("Silver");
		
		//calling get car details method //
		car.getCarDetails();
		
		//
		Scanner scanner = new Scanner(System.in);
		
		//user input for setting car color//
		System.out.println("Please enter the car color of your choice.");
		String carColor = scanner.next();		
				
		//update car details method //
		car.setCarDetails(carColor);
		
		//calling get car details method //
		car.getCarDetails();
				
		scanner.close();
		
	}

}
