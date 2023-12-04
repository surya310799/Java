package java_class;

import java.math.BigDecimal;
import java.math.RoundingMode;

//InbiltMethods
public class InbuiltMethods {
	static Integer i = new Integer(10);
	static Integer i1 = new Integer(5);
	static Integer i2 = new Integer(20);
	static Character ch = new Character('a');
	static String s1 = "5";
	static String s = "this is backend class";
	static String s2 = " ";
	static String s3 = " Hello world ";
	static BigDecimal bd = new BigDecimal(14.5);
	static char [] chr = {'j','a','v','a'};
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
		System.out.println("");
		
		//String InbuiltMethods
		System.out.println("s = this is backend class");
		System.out.println("get char from String using s.charAt(0) = "+s.charAt(0));
		System.out.println("split value from String to store a Array:");
		String [] arr = s.split(" ");
		for(String a: arr) {
			System.out.println(a);
		}
		System.out.println("Checking to there is or there isn't s.contains(\"th\") = "+s.contains("th"));
		System.out.println("s.contentEquals(\"this is backend class\") = "+s.contentEquals("this is backend class"));
		System.out.println("s2 = \" \" ");
		System.out.println("checking s2.isEmpty() = "+s2.isEmpty());
		System.out.println("checking s2.isBlank() = "+s2.isBlank());
		System.out.println("s.concat(\" weekend\") = "+s.concat(" weekend"));
		System.out.println("s+\" weekend\"+\" students\" = "+s+" weekend"+" students");
		System.out.println("s.indexOf('b',5) = "+s.indexOf('b',5));
		System.out.println("s.lastIndexOf('s') = "+s.lastIndexOf('s'));
		System.out.println("repeat :");
		System.out.println(s.repeat(2));
		System.out.println("get more than one of char from string :");
		System.out.println("s.substring(8,15) = "+s.substring(8,15));
		System.out.println("copy value of chr = {'j','a','v','a'}");
		System.out.println("s.copyValueOf(chr) = "+s.copyValueOf(chr));
		System.out.println("Before trim :");
		System.out.println(s3);
		System.out.println("After trim s3.trim()");
		System.out.println(s3.trim());
		System.out.println("s.toUpperCase() = "+s.toUpperCase());
		System.out.println("s.startsWith(\"ss\") = "+s.startsWith("ss"));
		System.out.println("s.startsWith(\"th\") = "+s.startsWith("th"));
		System.out.println("s.endsWith(\"th\") = "+s.endsWith("th"));
		System.out.println("s.endsWith(\"ss\") = "+s.endsWith("ss"));
		System.out.println("");
		
		//BigDecimal InbuiltMethods
		System.out.println("bd = "+bd);
		System.out.println("compare "+bd+" to 15 = "+bd.compareTo(new BigDecimal(15)));
		System.out.println("add "+bd+" + 5.5 = "+bd.add(new BigDecimal(5.5)));
		System.out.println("bd.setScale(0,RoundingMode.HALF_UP) = "+bd.setScale(0,RoundingMode.HALF_UP));
		System.out.println("bd.setScale(0,RoundingMode.HALF_DOWN) = "+bd.setScale(0,RoundingMode.HALF_DOWN));
		System.out.println("bd.setScale(0,RoundingMode.CEILING) = "+bd.setScale(0,RoundingMode.CEILING));
		System.out.println("bd.setScale(0,RoundingMode.FLOOR) = "+bd.setScale(0,RoundingMode.FLOOR));
		
		
		
	}

}
