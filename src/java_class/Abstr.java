package java_class;

abstract class Parant2{
	abstract void display();
	
}
public class Abstr {
	public void display() {
		System.out.println("Given body here");
	}

	public static void main(String[] args) {
		Abstr obj = new Abstr();
		obj.display();
		

	}

}
