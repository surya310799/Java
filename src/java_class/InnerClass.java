package java_class;

//Inner Class
class Outer{
	
	int a = 1;
	class Inner{
		int b = 2;
	}
}
public class InnerClass {

	public static void main(String[] args) {
		Outer obj = new Outer();
		Outer.Inner obj2 = obj.new Inner();
		
		System.out.println("Output of outer class "+obj.a);
		System.out.println("Output of inner class "+obj2.b);

	}

}
