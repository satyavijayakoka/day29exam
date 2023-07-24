package packageexam;

public class day29exam2 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.makesound();
		d.sleep();
		d.displaymesg();
		d.displaymesg2();

	}

}
abstract class Animal{
	abstract void sleep();
	abstract void makesound();
	
	public void displaymesg() {
		System.out.println("i am animal");
	}
}
class Dog extends Animal{

	public void sleep() {
		System.out.println(" i am sleeping");
		
	}

	public void makesound() {
		System.out.println("dog barks");
				
	}
	public void displaymesg2() {
		System.out.println("i am dog");
	}
	
}