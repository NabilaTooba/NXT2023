package javapractice;

public class Lec2ifelse {

	public static void main(String[] args) {
	
		/*
		 if(condition){
		 //block of code to be executed if the condition is true
		 }
		 */

		if (99>69) {
			System.out.println("99 is greater then 69");
		}
		
		
		
      int x=10;
      int y=5; 
     //if statement 
      if (x>y) {
    	  System.out.println("x is greater then y");
      }
      
      
	int time=24;
	if (time<12) {
		System.out.println("good morning");
	}
	else if (time<17) {
		System.out.println("good afternoon");
	}
	else if(time<19) {
		System.out.println("good evening");
	}	
	else{
		System.out.println("good night");
	} 
	
	
	//if statement class assignment print the good evening
       
	   int time1=30;
       if (time1>35) {
    	   System.out.println("good morning");
       }
       else if (time1>45) {
    	   System.out.println("good afternoon");
       }
       else {
    	   System.out.println("good evening");
       }
       
        
   // destination of state and mileages
        
       int mil=9500;
       if(mil>10000) {
    	   System.out.println("My destination is nsw");
       }
       else if (mil>9000) {
    	   System.out.println("My destination is brisben");
       }
       else if (mil>11000) {System.out.println("My destination is adelaide");
       }
    	   
	else {
		System.out.println("My destination is perth");
	}
       
   // if statement am and pm
       
       double currenttime=10.43;
       double currenttime1=18.05;
       if(currenttime>9.05) {
    	   System.out.println("The current time is  " + currenttime + "am");
       }
       if(currenttime1>16.00) {
    	   System.out.println("the current time is  " + currenttime1 +"pm");
       }
       
       
    		  
	
	
	
	
	}

}
