package java_class;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

//Collections
// ArrayList, LinkedList, HashSet, HashMap
public class Collect {
	
	public static void main(String[] args) {
		//ArrayList
		ArrayList<Integer> arr1 = new ArrayList<Integer>(); 
		//LinkedList
		LinkedList<Integer> arr2 = new LinkedList<Integer>();
		//HashSet
		HashSet<Integer> arr3 = new HashSet<Integer>();
		//HasMap is like JSON or Object type
		HashMap<String,String> obj1 = new HashMap<String,String>();
		
		//Empty ArrayList
		System.out.println("Empty ArrayList");
		System.out.println(arr1);
		
		//add element to variable
		arr1.add(10); 
		System.out.println("Added value to ArrayList");
		System.out.println(arr1);
		
		//Clear the ArrayList
		arr1.clear();
		System.out.println("Clear the ArrayList");
		System.out.println(arr1);
		
		//Added multiple values to ArrayList
		arr1.add(20);
		arr1.add(30);
		System.out.println("Added multiple values to ArrayList");
		System.out.println(arr1);
		
		//Add another array to ArrayList
		arr1.addAll(arr1);
		System.out.println("Add another array to ArrayList");
		System.out.println(arr1);
		
		//get value from ArrayList
		System.out.println("get value from ArrayList");
		System.out.println(arr1.get(0)); 
		
		
		//remove value using index from ArrayList 
		arr1.remove(0);
		System.out.println("remove value from ArrayList using index");
		System.out.println(arr1);
		
		//set value to ArrayList using index
		arr1.set(0, 50);
		System.out.println("set value to ArrayList using index");
		System.out.println(arr1);
		
		//to find a value in ArrayList
		System.out.println("to find a value in ArrayList");
		System.out.println(arr1.contains(20));
		
		//to check is Empty or not
		System.out.println("to check is Empty or not");
		System.out.println(arr1.isEmpty());
		
		
		//Lambda function
		System.out.println("Lambda function");
		arr1.forEach((e)->{
			System.out.println(e);
			});
		
		
		//Iterator
		System.out.println("Iterator for get value from ArrayList");
		Iterator<Integer> it = arr1.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}

		
		System.out.println("");
		
		//Empty LinkedList
		System.out.println("Empty LinkedList");
		System.out.println(arr2);
		
		//Add value to LinkedList
		arr2.add(11);
		System.out.println("Add value to LinkedList");
		System.out.println(arr2);
		
		//set value to LinkedList using index
		arr2.set(0, 22);
		System.out.println("set value to LinkedList using index");
		System.out.println(arr2);
		
		//Add another array to LinkedList
		arr2.addAll(arr1);
		System.out.println("Add another array to LinkedList");
		System.out.println(arr2);
		
		System.out.println("");
		
		//HashSet
		arr3.add(1);
		System.out.println("HashSet");
		System.out.println(arr3);
		
		//HashSet can't accept to add same value
		arr3.add(1);
		System.out.println("HashSet can't accept to add same value");
		System.out.println(arr3);
		
		System.out.println("");
		
		//HashMap
		//Empty
		System.out.println("Empty HashMap");
		System.out.println(obj1);
		
		//put Values by Key,Value
		System.out.println("put Values by Key:Value");
		obj1.put("name","surya");
		obj1.put("age","24");
		obj1.put("ID","1");
		System.out.println(obj1);
		
		//Get value from HashMap using Key
		System.out.println("Get value from HashMap using Key");
		System.out.println(obj1.get("name"));
		
		//Get key and value from HashMap using entrySet
		System.out.println("Get key and value from HashMap using entrySet");
		for(Entry<String,String> i: obj1.entrySet()){
			System.out.println(i);
		}
		
		//replace value
		System.out.println("replace value");
		obj1.replace("name", "vijay");
		System.out.println(obj1);
		
		//remove
		System.out.println("remove");
		obj1.remove("ID");
		System.out.println(obj1);
		
		//clear
		System.out.println("clear");
		obj1.clear();
		System.out.println(obj1);
		
	}

}
