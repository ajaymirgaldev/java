package jinharitence;

//
public class Dog extends Animal {
	
	//
	Dog(){
		
	}
	
	//
	public void bark(){
		System.out.println("Dog can Bark...");
	}
	
	public static void main(String arg[]){
		
		//instance of Dog class//
		Dog dog = new Dog();
		
		//
		dog.bark();
		dog.eat();
		
	}
}
