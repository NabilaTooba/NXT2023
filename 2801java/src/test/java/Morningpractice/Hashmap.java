package Morningpractice;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		
		// HashMap syntax: HashMap<datatype1,datatype2>variable=new HashMap<datatype1,datatype2>();
        //HashMap add    : variable.put()method;
		//HashMap access : variable.get()method;
		//HashMap remove : variable.remove()method;
		//HashMap size   : variable.size()method;
		
		
		//add 5 state and city by using HashMap
		HashMap<String,String>countrycity=new HashMap<String,String>();
		countrycity.put("1.NSW", "Sydney");
		countrycity.put("2.NSW", "Edmonsonpark");
		countrycity.put("3.NSW", "Newcastle");
		countrycity.put("4.Victoria","Melbourne" );
		countrycity.put("5.victoria", "geelong");
		System.out.println(countrycity);
		
		//access
		System.out.println(countrycity.get("1.NSW")); 
		
		//size
		countrycity.size();
	    System.out.println(countrycity.size());
		
		
		//remove 1 item
		
		System.out.println(countrycity.remove("3.NSW"));
		
	//remove all item
		countrycity.clear();
		System.out.println(countrycity);
		
		
		
		
		
		
		
		
		
	}

}
