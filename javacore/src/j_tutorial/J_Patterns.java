package j_tutorial;
import java.util.Scanner;
public class J_Patterns {

	public static void main(String[] args) {

		// Declaration //
		int rows;

		// Initialization //

		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows needed to print the pattern ");

		//
		rows = scanner.nextInt();
		
		//for loop to generate rows
		/* ---- Stars Pattern 1
		 
		*
		**
		***
		****
		
		*/
		
		System.out.println("Star Pattern 1");
		System.out.println("");
		for(int i = 1; i <= rows; i++){
			
			//
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			
			//
			System.out.println("");
		}
		System.out.println("------------------------------");

		/* ---- Stars Pattern 2
		 
		   *
		  **
		 ***
		****
		
		*/
		System.out.println("Star Pattern 2");
		System.out.println("");
		
		//
		for(int i = 1; i <= rows; i++){
			
			//Print spaces //
			for(int j = rows; j > i; j--){
				System.out.print(" ");
			}
			
			//Print * //
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		System.out.println("------------------------------");
		
		/* ---- Stars Pattern 3
		 
		****
		***
		**
		*
		
		*/
		System.out.println("Star Pattern 3");
		System.out.println("");
		
		for(int i=1; i<=rows; i++){
			
			//
			for(int j=rows; j>=i; j--){
				System.out.print("*");
			}
			
			//
			System.out.println("");
		}
		
		System.out.println("------------------------------");
		System.out.println("Star Pattern 4");
		/* ---- Stars Pattern 4
		 
		****
		 ***
		  **
		   *
		
		*/
		
		for(int i = 1; i<= rows; i++){
			
			//
			for(int l = 1; l< i; l++){
				System.out.print(" ");
			}
			
			//
			for(int j = rows; j>=i ; j--){
				System.out.print("*");
			}
			
			//
			System.out.println("");
		}
		
		System.out.println("------------------------------");
		System.out.println("Star Pattern 5");
		
		/* ---- Stars Pattern 5
		 
		    *    
		   ***   
		  *****
		 ******* 
		*********
		
		*/
		
		for(int i = 1; i<=rows; i++){
			
			//Space in decreasing order 
			for(int l = rows; l>i; l--){
				System.out.print(" ");
			}
			
			//Star in increasing order
			int newLength = (i * 2) -1;
			for(int j = 1; j<=newLength; j++){
				System.out.print("*");
			}
			
			//
			System.out.println("");
		}
		
		System.out.println("------------------------------");
		System.out.println("Star Pattern 6");
		
		/* ---- Stars Pattern 6
		  
		*********
		 *******
		  *****
		   ***
		    *
		*/
		
		for(int i = rows; i>=1; i--){
						
			
			int newLength = (i * 2)-1;
			for(int j = 1; j<=newLength; j++){
				System.out.print("*");
			}
			System.out.println();
			
			//
			for(int l=rows; l>=i; l--){
				System.out.print(" ");
			}
			
		}
		
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("Star Pattern 7");
		
		/* ---- Stars Pattern 7
		 
		    *    
		   ***   
		  *****
		 ******* 
		*********
		 *******
		  *****
		   ***
		    *
		*/
		for(int i = 1; i<=rows; i++){
			
			int newLength = (i * 2) -1;
			for(int l=rows; l>i; l--){
				System.out.print(" ");
			}
			
			//
			for(int j = 1; j<=newLength; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//		
		for(int i = rows; i >= 1; i--){
			
			//
			int newLength = (i * 2) -1;
			for(int j = 1; j<= newLength; j++){
				System.out.print("*");
			}
			System.out.println();
			
			//
			for(int l = rows; l>=i; l--){
				System.out.print(" ");
			}
		}
		
		System.out.println("------------------------------");
		System.out.println("Star Pattern 8");
		
		/* ---- Stars Pattern 7
		 
		    *    
		    **   
		    ***
		    **** 
		    *****
		    ****
		    ***
		    **
		    *
		*/
		for(int i=1; i<=rows; i++){
			
			//
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1; i<=rows-1; i++){
			
			//
			for(int j = rows-1; j>=i; j--){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("------------------------------");
		System.out.println("Star Pattern 9");
		
		/* ---- Stars Pattern 7
		 
		        *    
		       **   
		      ***
		     **** 
		    *****
		     ****
		      ***
		       **
		        *
		*/
		for(int i=1; i<=rows; i++){
			
			//
			for(int l = rows; l>i; l--){
				System.out.print(" ");
			}
			
			//
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1; i<=rows; i++){
			
			//
			for(int l = 1; l<i; l++){
				System.out.print(" ");
			}
			//
			for(int j = rows; j>=i; j--){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("------------------------------");
		System.out.println("Star Pattern 9");
		
		/* ---- Stars Pattern 7
		 
		        *****    
		       *****   
		      *****
		     ***** 
		    *****
		     *****
		      *****
		       *****
		        *****
		*/
		
		for(int i=1; i<=rows; i++){
			//
			for(int l=rows; l>i; l--){
				System.out.print(" ");
			}
			
			//
			for(int j=1; j<=rows; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i<=rows; i++){
			
			//
			for(int l=1; l< i; l++){
				System.out.print(" ");
			}
			
			//
			for(int j=1; j<=rows; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		System.out.println("Star Pattern 12");
		
		/* ---- Stars Pattern 12
		 
		        *****
		        ****
		        ***
		        **
		        *
		        **
		        ***
		        ****
		        *****
		*/
		for(int i = 1; i<=rows; i++){
			
			//
			for(int j = rows; j >= i; j--){
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int i = 2; i<=rows; i++){
			
			//
			for(int l = 1; l <=i; l++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		System.out.println("Star Pattern 13");
		
		/* ---- Stars Pattern 13
		 
		        *****
		         ****
		          ***
		           **
		            *
		           **
		          ***
		         ****
		        *****
		*/
		for(int i =1; i<=rows; i++){
			
			//
			for(int l = 1; l < i; l++){
				System.out.print(" ");
			}
			
			//
			for(int j =rows; j>=i; j--){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//
		for(int i = 1; i <= rows; i++){
			
			//
			for(int l=rows; l>i; l--){
				System.out.print(" ");
			}
			
			//
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		System.out.println("Star Pattern 14");
		/* ---- Stars Pattern 14
		 
	        *******
	         *****
	          ***
	           *
	          ***
	         *****
	        *******
	    */
		
		//
		
		/*for(int i = rows; i>=1; i--){
						
			
			int newLength = (i * 2)-1;
			for(int j = 1; j<=newLength; j++){
				System.out.print("*");
			}
			System.out.println();
			
			//
			for(int l=rows; l>=i; l--){
				System.out.print(" ");
			}
			
		}*/
		for(int i = rows; i>=1; i--){
			
			//
			int newLength = (i*2)-1;
			for(int l = 1; l <=newLength; l++){
				System.out.print("*");
			}
			
			System.out.println();			
			//
			for(int j = rows; j >=i; j--){
				System.out.print(" ");
			}
			
		}
		
		//
		for(int i = 2; i<= rows; i++){
			
			//
			for(int l =rows; l>i; l--){
				System.out.print(" ");
			}
			//
			for(int j = 1; j<= (i * 2)-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//
		scanner.close();
	}

}
