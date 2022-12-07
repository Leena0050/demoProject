package JavaConceptssss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating arraylist
		System.out.println("Array list");
		ArrayList<String> city = new ArrayList<String>();//Empty array list
		city.add("Banglore");// twe used object and then add used to insert data into array
		city.add("Delhi");
		System.out.println(city);
		
		
		//Creating vector
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> vec = new Vector<Integer>();
		vec.addElement(35);
		vec.addElement(30);
		System.out.println(vec);
		
		
		// Creating linkedlist
		System.out.println("\n");
		System.out.println("linkedlist");
		LinkedList<String> names = new LinkedList<String>();
		names.add("alex");
		names.add("john");
		Iterator<String> itr = names.iterator(); // to print 1 by 1 element
		while (itr.hasNext()) {
		System.out.println(itr.next());
		
		
		// Creating hashset  - it will arrange in ascending order
		System.out.println("\n");
		System.out.println("Hashset");
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(101);
		set.add(103);
		set.add(102);
		set.add(104);
		System.out.println(set);	
		
		
		// Creating linkedhashset -  it will print as it is
		System.out.println("\n");
		System.out.println("Linkedhashset");
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(11);
		set.add(13);
		set.add(12);
		set.add(14);
		System.out.println(set2);		
		
		
		
		
		
		
		
		
	}
	}
}
