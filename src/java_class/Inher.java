package java_class;

//Inheritance
class Parent1{
	int a = 1;
	}

//Inheritance key word extends
class Child1 extends Parent1{
	int b = 2;
	int c = super.a; // super for access parent element in child
} 
public class Inher {
	
	public static void main(String[] args) {
		Child1 obj = new Child1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}

}
