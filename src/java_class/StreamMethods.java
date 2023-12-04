package java_class;
// Stream
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		List<Integer> mapL = al.stream().map((e)->e+5).collect(Collectors.toList());
		List<Integer> filterL = al.stream().filter((e)->e>11).collect(Collectors.toList());
		int reduceAl = al.stream().reduce(0,(e,i)->e+i);
		boolean b = al.stream().allMatch((e)->e>10);
		boolean b1 = al.stream().anyMatch((e)->e>10);
		System.out.println("ArrayList = "+al);
		System.out.println("List from ArrayList using map = "+mapL);
		System.out.println("List from ArrayList using filter = "+filterL);
		System.out.println("Add all values from ArrayList using reduce = "+reduceAl);
		System.out.println("if all values is match to greater than 10 = "+ b);
		System.out.println("if any value is match to greater than 10 = "+ b1);
	}

}
