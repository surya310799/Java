package java_class;

public class Constru {
//Constructor
	Constru(){
		System.out.println("Wecome to constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constru obj = new Constru();
		
		//Encapsulation
		
		//set a value from Encap
		Encap.setter(15);
		
		//get a value to Encap
		System.out.println(Encap.getter());
	}

}
