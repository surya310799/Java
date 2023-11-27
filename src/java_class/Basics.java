package java_class; //Package


public class Basics {
	//Declaration area
	
	//MODIFIERS:
	// for attributes,Methods and Constructors you can use the one of the below:
	//1.Public, 2.Private, 3.Protected, 4.Default
	
	// variables or attributes or object
	//DATA TYPES:
	//static
	
	static int n = 1; //Number
	static long nl = 1234567890; //Number
	static float nf = 15; //Number
	static double nd = 15.45; //Number
	static char c = 'a';	//Character
	static String s = "Hello World";	//String
	static boolean bt = true; 	//Boolean
	static boolean bf = false;	//Boolean
	static int[] arr = {10,20,30,40,50}; //Array
	//non-static or Default
	
	int n1 = 2; 

	//type casting:
	//Narrow casting
	//byte->short->char->int->long->float->double
	
	static int n2 = (int) nd;
	
	
	//FUNCTION or METHOD:
	//void function
	static void add(){
		n = n+1;
	}
	
	//void function with parameter or argument
	static void sum(int a){
		nf = nf*a;
	}
	
	// return function
	static int get(){ 
		return 55;
		} 
	
	// return function with parameter or argument
	static int set(int a){ 
		return a;
		} 
	
	//OPERATORS:
	//Arithmetic,Logical,Ternary,Comparison
	//Arithmetic:
	// +, -, /, *,%
	
	//Logical:
	//<, >, <=, >=, ==, !=
	
	//Ternary:
	//(condition)? "if true": "if false";
	
	//Comparison:
	// && - (and), || - (or)
	
	
	//LOOPS:
	//for, while, do while, for each
	
	public static void main(String[] args) {
	//Output area
	 	Basics obj = new Basics(); //reference or initializing 
	
		//get output for non-static or default
		System.out.println("Example of non-static or Default is "+obj.n1);
		
		//get output for static
		System.out.println("DATA TYPES:");
		System.out.println("Number datatype int is "+n);
		System.out.println("Number datatype long is "+nl);
		System.out.println("Number datatype float is "+nf);
		System.out.println("Number datatype double is "+nd);
		System.out.println("Character datatype char is "+c);
		System.out.println("String datatype string is "+s);
		System.out.println("Boolean datatype boolean is "+bt);
		System.out.println("Boolean datatype boolean is "+bf);
		System.out.println("_____________________________________");
		
		//TYPE CASTING:
		System.out.println("TYPE CASTING:");
		System.out.println("Type casting from double to int is "+n2);
		System.out.println("_____________________________________");
		
		//FUNCTION OR METHOD:
		System.out.println("FUNCTION OR METHOD:");
		System.out.println("void function:");
		System.out.println("n value is before is "+n);
		add();
		System.out.println("n value is after called function is "+n);
		System.out.println("void function with parameter:");
		System.out.println("nf value is before is "+nf);
		sum(2);
		System.out.println("nf value is after called function is "+nf);
		System.out.println("return function:");
		System.out.println(get());
		System.out.println("return function with parameter");
		System.out.println(set(100));
		System.out.println("_____________________________________");
		
		//Loops:
		//for loop
		System.out.println("Loops:");
		for(int i=0; i<arr.length; i++){
			System.out.println("Get array value is "+arr[i]+ " using for loop");
		}
		System.out.println("");
		
		//while loop
		int j =0;
		while(j<arr.length){
			System.out.println("Get array value is "+arr[j]+ " using while loop");
		j++;
		}
		System.out.println("");
		
		//do while
		int k =0;
		do{
			System.out.println("Get array value is "+arr[k]+ " using do while loop");
			k++;
		} while(k<arr.length);
		System.out.println("");
		
		//for each
		for(int obj1:arr){
			System.out.println("Get array value is "+obj1+ " using for each loop");
		}
		System.out.println("_____________________________________");
		
		
		// if, else if, else
		System.out.println("IF, ELSE IF, ELSE:");
		int y = 10;
		if(y<10){
			System.out.println("10 is greater");
		}else if(y==10){
			System.out.println("10 is equal to x");
		}else{
			System.out.println("print when all conditions is failed");
		}
		
	}
}
