
public class PolyTest {

	public static void makeSoundTest(Animal animal){
		animal.makeSound();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		makeSoundTest(cat);
		makeSoundTest(dog);
	}

}
