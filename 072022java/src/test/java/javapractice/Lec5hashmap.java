package javapractice;

import java.util.HashMap;

public class Lec5hashmap {

	public static void main(String[] args) {
		
	//HashMap<datatype1,datatype2>variable name= new HashMap <datatype1,datatype2>();
		//store 3 city and country name of Tx state
		
		HashMap<String,String>capital=new HashMap<String,String>();
		capital.put("Tx", "Irving");
		capital.put("Tx", "dalas");
		capital.put("Tx", "piano");
		capital.put("NY" ,"Queens");
		capital.put("NY","brooklyn");
		System.out.println(capital);
		
		//remove
		 
		System.out.println(capital.remove("Tx"));
		
		//create 3 student name and IDs
		HashMap<String, Integer>student=new HashMap<String,Integer>();
		student.put("Nabila", 21);
		student.put("Tabassum",22);
		student.put("Tooba",23);
		System.out.println(student);
		
		//remove
		System.out.println(student.remove("Nabila", 21));
		 
		
		

	}

}
