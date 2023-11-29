package java_class;
//recursion
//recursion is use to find factorial of a number
public class Recurs {
	public static int fact(int a){
		if(a!=0) {
			return a*fact(a-1);
		}else {
			return 1;
		}
	}

		static int n = 5;
	public static void main(String[] args) {
		
		System.out.println(n+" Factorial is "+fact(n));		
		
	}

}
