package packageexam;

public class day29q6 {

	public static void main(String[] args) {
		AnimalK A = new AnimalK();
		A.makeSound();
		DogK d = new DogK();
		d.makeSound();
		CatK c = new CatK();
		c.makeSound();

	}

}
class AnimalK{
	public void makeSound() {
		System.out.println("animal makes sound");
	}
	
}
class DogK extends AnimalK{
	public void makeSound() {
		System.out.println("dog barks");
	}	
}
class CatK extends AnimalK{
	public void makeSound() {
		System.out.println("meow meow");
	}
}