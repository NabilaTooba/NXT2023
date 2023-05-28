package Morningpractice;

import java.util.ArrayList;

public class Forlooppractice3 {

	public static void main(String[] args) {
		
		
		//even number 0 to 20
	    for(int i=0;i<=20;i=i+2) {
	    	System.out.println(i);
	    }
			
		//odd number 0 to 20
	    for(int i=1; i<20;i=i+2) {
	    	System.out.println(i);
	    }
			
			// ptint 0to 10
	    for(int i=0; i<=10; i=i+1) {
	    	System.out.println(i);
	    }
	    //print 5 times nxt
			for(int i=1;i<=5;i=i+1) {
				System.out.println("nxt");
			}
			
			//print 6 times tooba
			
			for(int i=1;i<=6;i=i+1) {
				System.out.println("tooba");
			}
			
	// reverse sytax:		
	String name="Tooba";
	String Reverse="";
	
	StringBuffer onj= new StringBuffer(name);
	System.out.println(onj.reverse());
	}

}  
