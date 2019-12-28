package j_tutorial;

import java.util.Scanner;

public class J_Primenumbers {
	public static void main(String[] args) {
		// Q. Calculate Prime Numbers//
		/*Definition:
		 * A prime number is a whole number greater than 1 
		 * whose only factors are 1 and itself. 
		 * A factor is a whole numbers that can be divided evenly 
		 * into another number. 
		 * 
		 * */
		
		
		Scanner scanner = new Scanner(System.in);
		/*Initialization*/
		int userInput;
		
		/*Declaration*/
		userInput = 0;
				
		//
		System.out.println("Please insert number value.");
		userInput = scanner.nextInt();
		
		//
		int count = 0;
		for (int i = 2; i < (userInput / 2); i++) {
			if((userInput % i) == 0){
				
				count++;	
				if(count >= 1){
					break;
				}
			}
		}
		
		//
		if(count == 0){
			System.out.println(userInput + " is Prime Number.");
		}else{
			System.out.println(userInput + " is not a Prime Number.");
		}

		//
		scanner.close();
	}
}
