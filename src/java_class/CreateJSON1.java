package java_class;

import java.util.ArrayList;
import java.util.HashMap;

//JSON
public class CreateJSON1 {

	public static void main(String[] args) {
		ArrayList<Object> JSON1 = new ArrayList<Object>();
		HashMap<String,String> user1 = new HashMap<String,String>();
		HashMap<String,String> user2 = new HashMap<String,String>();
		HashMap<String,String> user3 = new HashMap<String,String>();
		HashMap<Integer,Object> JSON2 = new HashMap<Integer,Object>();
		
		
		//user1
		user1.put("name", "surya");
		user1.put("age", "24");
		user1.put("ID", "1");
		//user2
		user2.put("name", "gokul");
		user2.put("age", "26");
		user2.put("ID", "2");
		//user3
		user3.put("name", "yogesh");
		user3.put("age", "24");
		user3.put("ID", "3");

		//Array of object
		JSON1.add(user1);
		JSON1.add(user2);
		JSON1.add(user3);
		System.out.println(JSON1);		
		JSON1.forEach((e)->{
			for(int i=1; i<JSON1.size()+1; i++) {
				JSON2.put(i, e);
			
			}
		});
		System.out.println(JSON2);
	}

}
