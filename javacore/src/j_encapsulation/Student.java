package j_encapsulation;

import java.util.Scanner;

/*
Encapsulation in Java is a process of wrapping code and data together into a single unit, 
for example, a capsule which is mixed of several medicines.

Advantage of Encapsulation in Java
-- It provides you the control over the data.
-- It is a way to achieve data hiding

*/

/*A Java class which is a fully encapsulated class.   
It has a private data member and getter and setter methods.*/
public class Student {
	
	//Declaration//
	Scanner scanner = new Scanner(System.in);
	
	//
	private String s_name;
	private int s_rollNumber;
	private String s_stream;
	private String s_collageName;
	
	//
	Object s_data = new Object();
	 
	
	//Initialization//
	//TO DO //
	/*
	 * sData{
	 * 	"s1":[{
	 * 		"name":"A1",
	 * 		"rnum":001,
	 * 		"stream":"bTech",
	 * 		"college":"SB"
	 * 	}],
	 *  "s2":[{
	 * 		"name":"A1",
	 * 		"rnum":001,
	 * 		"stream":"bTech",
	 * 		"college":"SB"
	 * 	}],
	 * "s3":[{
	 * 		"name":"A1",
	 * 		"rnum":001,
	 * 		"stream":"bTech",
	 * 		"college":"SB"
	 * 	}],
	 * "s4":[{
	 * 		"name":"A1",
	 * 		"rnum":001,
	 * 		"stream":"bTech",
	 * 		"college":"SB"
	 * 	}],
	 * }*/
	
	//setter method for student details//
	public void setStudentDetails(){
		
		//
		//Object tempObj = new Object();
		Object[] tempObj = new Object[]{};
		//
		
		System.out.println("Please input student name.");
		this.s_name = scanner.next();
		
		//To DO: Use JSON to store values //
		//tempObj.add(scanner.next());
		
		System.out.println("Please input student Roll Number.");
		this.s_rollNumber = scanner.nextInt();
		
		System.out.println("Please input student educational stream.");
		this.s_stream = scanner.next();
		
		System.out.println("Please input student Collage Name.");
		this.s_collageName = scanner.next();
	}
	
	//getter method for student details//
	public String getStudentDetails(){
		
		//
		String s_details = "Name: "+this.s_name + " Roll Number: "+this.s_rollNumber + " Stream: "+this.s_stream + " Collage: "+this.s_collageName;
		return s_details;
	}
	
	//Constructor //
	Student(){};
	
	//
	public static void main(String[] args) {
		
		//
		//Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		//
		String x = new String();
		Boolean isContinue = false;
		
		//If user input Yes; will continue input for next student //
		do{
		
			//
			System.out.println("Welcome!");
			student.setStudentDetails();
			
			//
			String s_detail =  student.getStudentDetails();
			System.out.println("Student details : \n"+s_detail);
			
			//
			System.out.println();
			
			//
			System.out.println("Do you want to fill record for other student? Y/N");
			x = student.scanner.next();
			x = x.toLowerCase();
			
			//terminate program if input N//
			isContinue = (x.equals("y"));
			if(!isContinue){
				System.out.println("Thank you so much! We exit!");
				System.exit(0);	
			}
			
		}
		while(isContinue);
		
		
		//
		student.scanner.close();
	}

}
