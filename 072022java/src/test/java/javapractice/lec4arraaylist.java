package javapractice;

import java.util.ArrayList;

public class lec4arraaylist {

	public static void main(String[] args) {
		//ArrayList is not fixed we can add or remove data as much as we can
		
		//syntax: ArrayaList <datatype> variable name= new ArrayList<datatype>();
		
        //add or store 3 cars in ArrayList
		
		ArrayList<String> Sportscar = new ArrayList<String>();// create an ArrayList object
		Sportscar.add("nissan");
		Sportscar.add("BMW");
		Sportscar.add("jeep"); 
		System.out.println(Sportscar);
		
		//how to access the value in ArrayList
		//syntax:variable.get()method and refer to the index number
		System.out.println(Sportscar.get(0));
		
		//how to change the value (very imp and careful)
		//syntax:vsrisble.set()method and refer to the index number
		Sportscar.set(0, "Bentley");
		System.out.println(Sportscar.set(0, "Bentley"));
		
		
		//size
		//syntax:variable.size
	       System.out.println(Sportscar.size());
	       
	    //remove
	    //syntax: variable.remove()method and refer to the index number
	       System.out.println(Sportscar.remove(2));
		
		// add or store any 3 Integer value by using ArrayList
		
		 ArrayList<Integer>no= new ArrayList<Integer>();
		no.add(100);
		no.add(200);
		no.add(300);
		 System.out.println(no);
		 
		//access
		 //syntax: variable.get() method and refer to the index number
		 System.out.println(no.get(0));
		 
		//change  (very imp and be careful)
		 // syntax: variable.get()method and refer to the index number
		 no.set(1, 400);
		 System.out.println(no.set(1, 400));
		 
		 //size
		 //syntax: variable.size
		 System.out.println(no.size());
		 
		 //remove
		 //syntax:variable.remove()method and refer to the index number
		 System.out.println(no.remove(2));
		  
		
	
		
	}
	

}
