package Morningpractice;

import java.util.ArrayList;

public class Enhancedforloop {

	public static void main(String[] args) {
		
		// Enhanched for loop 
		
		// syntax of enhanced for loop is getting one way : 
				//                               for(datatype a:variable){
				//                               System.out.println(a);}
				//syntax of enhanced for loop is getting another way:
				//                                for (int i=0; i< variable.size(); i=i+1){
				//                                        system.out.println(variable.get())}
		
		//loop through an ArrayList
		//loop through the elements of an ArrayList with a for loop and use the size() method to specify how many times the loop should run
		
		
	ArrayList<Integer>years= new ArrayList<Integer>();
		years.add(2013);
		years.add(2014);
		years.add(2015);
		years.add(2016);
		years.add(2017);
		
		for(int y=0;y<years.size();y=y+1) {
			System.out.println(years.get(y));
		}
		ArrayList<Integer>years2= new ArrayList<Integer>();
		years2.add(2023);
		years2.add(2024);
		years2.add(2025);
		years2.add(2026);
		years2.add(2027);
		 
		for(Integer a :years2) {
			System.out.println(a);
		}
		
   ArrayList<String>city=new ArrayList<String>();
	city.add("newcastle");
	city.add("jesmond");
	city.add("belmont");
	city.add("warnersBay");
	city.add("annabay");
		
		for(int i=0;i<city.size();i=i+1) {
			System.out.println(city.get(i));
		}
		
	ArrayList<String>city2= new ArrayList<String>();
	city2.add("jessore");
	city2.add("khulna");
	city2.add("dhaka");
	city2.add("rangpur");
	city2.add("dinajpur");
	
	for(String b : city2) {
		System.out.println(b);
	}
	
	 //enhanced for loop
		ArrayList<String>jahan1= new ArrayList<String>();
		jahan1.add("maven");
		jahan1.add("cucumber");
		jahan1.add("apple");
		for(String a:jahan1) {
			System.out.println(a);
		}
		
		//enhanced for loop
		ArrayList<String> jahan2 = new ArrayList<String>();
		jahan2.add("maven");
		jahan2.add("cucumber");
		jahan2.add("apple");
		
		for(int i=0; i<jahan2.size(); i=i+1) {
			System.out.println(jahan2.get(i));
		}
		
	}

}
