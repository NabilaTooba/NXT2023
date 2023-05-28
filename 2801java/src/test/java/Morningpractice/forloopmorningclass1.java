package Morningpractice;

import java.util.ArrayList;

public class forloopmorningclass1 {

	public static void main(String[] args) {
		 
     /* syntax of for loop
       for(statement1;satatement2;statement3){
      //code block to be executed}
      
		
		//print the value of 0-9
		 for(int i=0;i<=9;i=i+1) {
			 System.out.println(i);
		 }
		
		 //print even values between 0 and 25
		 for(int i=0; i<25;i=i+2) {
			 System.out.println(i);
		 }
		 
		 //print odd value between 0 and 25
		 for(int i=1;i<25;i=i+2) {
			 System.out.println(i);
		 }
		 
		 //print 5 times " I am a student of NXT"
		 for(int i=0;i<5;i=i+1) {
			 System.out.println("I am a student of NXT");
		 }
		 
		 //print 5 times i love nexttech ITC
		 for(int i=1; i<=5;i=i+1) {
			 System.out.println("i love nexttech ITC");
		 }
		 
		 //print 6 times "i love nxt ITC"
		 for(int i=0;i<6;i=i+1) {
			 System.out.println("i love nxt ITC");
		 }
		
		//loop through an Arraylist
		  ArrayList<String>cars=new ArrayList<String>();
		  cars.add("Nissian");
		  cars.add("Camero");
		  cars.add("Mustang");
		  cars.add("BMW");
		 
		 for(int i=0;i<=cars.size();i=i+1) {
			 System.out.println(cars.get(i));
		 }*/
		
		 
		 //reverse
		 String Name= "NABILA";
		 String Reverse= "";
		 
		 StringBuffer str= new StringBuffer(Name);
		 System.out.println(str.reverse());
		}

}
