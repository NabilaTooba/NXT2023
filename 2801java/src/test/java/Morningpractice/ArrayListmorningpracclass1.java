package Morningpractice;

import java.util.ArrayList;

public class ArrayListmorningpracclass1 {

	public static void main(String[] args) {
	
		//ArrayList
		//syntax: ArrayList<datatype>variable=new ArrayList<datatype>();
		
		//store  or add 7 colors
		
		ArrayList<String>colors=new ArrayList<String>();
		    colors.add("white");
		    colors.add("black");
		    colors.add("purpel");
		    colors.add("yellow");
		    colors.add("red");
		    colors.add("green");
		    colors.add("blue");
		    System.out.println(colors);
		    
		 //access
		    System.out.println(colors.get(0));
		    System.out.println(colors.get(1));
		    System.out.println(colors.get(2));
		    
		 //change
		    colors.set(4, "orange");
		    System.out.println(colors.set(4, "orange"));
		    
		//size
		    System.out.println(colors.size());
		    
		//remove
		    System.out.println(colors.remove(1));
		    
		    
		// store or add 5 years
		    
		  ArrayList<Integer>years=new ArrayList<Integer>();
		  years.add(2013);
		  years.add(2014);
		  years.add(2015);
		  years.add(2016);
		  years.add(2017);
		  System.out.println(years);
		  
		//access
		  System.out.println(years.get(0));
		  System.out.println(years.get(1));
		  System.out.println(years.get(2));
		  
		 //change
		  years.set(3, 2026);
		  System.out.println(years.set(3, 2026));
		  years.set(4, 2027);
		  System.out.println(years.set(4, 2027));
		  
		 //size
		  System.out.println(years.size());
		  
		  //remove
		  System.out.println(years.remove(0));
		  
		  
		  
		    
		    
		    
		    

	}

}
