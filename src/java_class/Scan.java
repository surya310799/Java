package java_class;
//Scanner
import java.util.Scanner;	//import scanner

public class Scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 	//Refer the scanner
		
		System.out.println("Enter your name");
		String name = sc.nextLine(); //Store the scanner value for String datatype
		
		System.out.println("Enter your age");
		int age = sc.nextInt();	//Store the scanner value for int datatype
		
		sc.close();	//close scanner

		System.out.println("Hello "+name+" "+age);
	}

}
