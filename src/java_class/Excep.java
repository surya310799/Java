package java_class;
	//Exception Handling
public class Excep {
	static int[] arr = {10,20,30,40};
	public static void main(String[] args) {
		
		try {	
		for(int i=0; i<4; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(10/0);
		}catch(ArithmeticException a) {
			System.out.println("Print from ArithmeticException");
			System.out.println(a); //throw a; - this command throw a error directly 
		}catch(Exception e){
			System.out.println("Print from Exception");
			System.out.println(e);
		}finally{
			System.out.println("Print from finally");
		}
		System.out.println("Welcome to Exception handling");
		
	}

}
