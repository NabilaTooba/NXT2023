package Morningpractice;

public class Ifmorningclass1 {

	public static void main(String[] args) {
		/* syntax of if statement
		 if(condition){
		//block of code to be executed if the condition is true
		  }
		 */
		
	//number
        if(70>60) {
    	   System.out.println("70 is greater than 60");
       }
       
    //grade
	    if (100>10) {
	        System.out.println("My grade is A ");
	     }
	
    //Testscore and grade 
		int testscore=90;
		char grade;
		if (testscore>=90) {
			System.out.println(grade='A');
		}
		else if (testscore>=80) {
			System.out.println(grade='B');
		}
		else if (testscore>=70) {
			System.out.println(grade='C');
		}
		else if(testscore>=60) {
			System.out.println(grade='D');
		}
		else {
			System.out.println(grade='F');
		}
		
	//time
		int time= 24;
		if(time>27) {
			System.out.println("Good Morning");
		}
		else if(time>30) {
			System.out.println("Good Noon");
		}
		else if(time>40) {
			System.out.println("Good Evening");
		}
		else {
			System.out.println("Good Night");
		}
		
		
		
		
	}	
		
		
	}


