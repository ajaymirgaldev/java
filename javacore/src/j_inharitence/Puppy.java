package j_inharitence;

public class Puppy extends Dog {

	//
	
	public void weep(){
		System.out.println("Puppy is weeping�");
	}
	
	public static void main(String[] args) {
		//
		Puppy puppy = new Puppy();
		
		//
		puppy.weep();
		
		//
		puppy.bark();

		//
		puppy.eat();
	}

}
