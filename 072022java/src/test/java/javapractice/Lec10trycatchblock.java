package javapractice;

public class Lec10trycatchblock {
	
	//exception in java: exception means code error.
	//to handle exception we use try and catch block
	
		public static void main(String[] args) {
		try {
			//BLOCK OF CODE
			int[]Number= {1,2,3};
			System.out.println(Number[4]);
		}
	    catch( Exception e) {
	    	//We handle the exception . we write the message here
	    	System.out.println("code is Array fail");
	    }
		
		
		

	}

}
