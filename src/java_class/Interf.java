package java_class;

interface Parent3{
	String s1 = "Parent";
}
interface P2{
	String s2 = "P2";

}
class Child3 implements Parent3,P2{

	String s3 = "Child";
}
public class Interf {

	public static void main(String[] args) {
		Child3 obj = new Child3();
		System.out.println(obj.s1);
		System.out.println(obj.s2); 
		System.out.println(obj.s3);
	}

}
