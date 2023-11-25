package java_class;

public class Enum {

	enum priority{
		Low,
		Medium,
		High
	} //datatype is name of declaration 
	public static void main(String[] args) {
		priority  l = priority.Low;
		priority  m = priority.Medium;
		priority  h = priority.High;
		
		System.out.println("Priority is "+l);
		System.out.println("Priority is "+m);
		System.out.println("Priority is "+h);
		
		for(priority obj: priority.values()) {
			System.out.println(obj); 
		}

	}

}
