package java_class;

//Pholymorphism
class Animals{
	public void animals_sound() {
		System.out.println("Default animals sound");
	}
}
class Dog extends Animals{
	public void animals_sound() {
		System.out.println("Dog sound");
	}
}

class Pig extends Animals{
	public void animals_sound() {
		System.out.println("Pig sound");
	}
}

public class Pholy {

	public static void main(String[] args) {
		Animals obj = new Dog(); //Reference
		obj.animals_sound();
		
		Animals obj1 = new Pig(); //Reference
		obj1.animals_sound();
	}

}
