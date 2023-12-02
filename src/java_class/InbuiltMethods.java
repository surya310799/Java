package java_class;
//InbiltMethods
public class InbuiltMethods {
	static Integer i = new Integer(10);
	static Integer i1 = new Integer(5);
	static Integer i2 = new Integer(20);
	static Character ch = new Character('a');
	static String s1 = "5";
	public static void main(String[] args) {
		
		//Integer InbuiltMethods
		//Compare
		System.out.println("i = "+i);
		System.out.println("Integer "+i+" compare to another Integer "+i1+" = "+i.compareTo(i1));
		System.out.println("Integer "+i+" compare to another Integer "+i2+" = "+i.compareTo(i2));
		System.out.println("Integer "+i+" compare to another Integer "+i+" = "+i.compareTo(i));
	
		//Type casting
		System.out.println(i.getClass().getSimpleName()+" "+i+" convert to "+i.byteValue()+" byte");
		System.out.println(i.getClass().getSimpleName()+" "+i+" convert to "+i.shortValue()+" short");
		System.out.println(i.getClass().getSimpleName()+" "+i+" convert to "+i.intValue()+" int");
		System.out.println(i.getClass().getSimpleName()+" "+i+" convert to "+i.longValue()+" long");
		System.out.println(i.getClass().getSimpleName()+" "+i+" convert to "+i.floatValue()+" float");
		System.out.println(i.getClass().getSimpleName()+" "+i+" convert to "+i.doubleValue()+" double");
		System.out.println(i.getClass().getSimpleName()+" "+i+" convert to "+i.toString().getClass().getSimpleName());
		
		//Max or Min
		System.out.println("Find a Max value "+i1+" or "+i2+" = "+Integer.max(i1, i2));
		System.out.println("Find a Min value "+i1+" or "+i2+" = "+Integer.min(i1, i2));
		//add string and integer
		System.out.print("Add "+s1.getClass().getSimpleName()+" "+s1+" + "+i1.getClass().getSimpleName()+" "+i1+" = ");
		System.out.println(Integer.valueOf(s1)+i1);
		System.out.println("");
		
		//Charecter InbuiltMethods
		System.out.println("ch = "+ch);
		System.out.println("Change to UpperCase = "+Character.toUpperCase(ch));
		System.out.println("Change to LoowerCase = "+Character.toLowerCase(ch));
		System.out.println("Checking is Digit = "+Character.isDigit(ch));
		System.out.println("Checking is Letter = "+Character.isLetter(ch));
		System.out.println("Checking is Whitespace = "+Character.isWhitespace(ch));
		System.out.println("Value of "+Character.valueOf(ch));
	}

}
