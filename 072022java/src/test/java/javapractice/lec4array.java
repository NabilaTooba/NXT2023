package javapractice;

public class lec4array {

	public static void main(String[] args) {
		//java collections- array,ArrayList, HashMap = store multiple data in single variable
		
		//store single data in single variable
		// syntax: datatype variable name= value;
		
		        int numbera=1;
		        int numberb=3;
	            String name ="nayeem";
		
		//Array
	    //Array we can store multiple values in single variable
	            
	    // syntax of Array:
	            
		//datatype[]variable={"value1","value2"...."value n"} for string 
	    // datatype[]variable={value1,value2,...value n}   for Integer   
		
	    // store 3 cars name by using Array        
		String[]cars = {"bmw","nissan","honda"};
		
		//store 5 flowers name by using array
		String[]Flowers={"rose","lily","jasmine","daisy","tulip"};

	     // store 5 whole number
	     int[] number1={10,20,30,40,50};
	     
	     // Access an Array
	     // access an array data by referring to the index number
	     // Index start from 0
	     // data or value or number start from 1
	     // data 1,2,3 will be index 0,1,2.
	     
	     //store and access
	     int[] number= {10,20,30,40,50};
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println(number[3]);
		System.out.println(number[4]);
		
		// how to store month
		//store 5 months and access 
		String[] months={"Jan","Feb","Mar ","Apr","May"};
      System.out.println(months [0]);
      System.out.println(months[2]);
      System.out.println(months[4]);
      
      //how to change the value
      //syntax : variable[change value index]= "new value";
      
      //change the value of Array
      String[] fruits= {"Mango","Watermelon","Orange","Apple"};
      fruits[0]="jackffruit";
      System.out.println(fruits[0]);
      
      //Length of Array
      //syntax: variable.length
      
      //print the cars length
      String[]car= {"bmw","mazda","toyota","honda","jeep","ford","nissan"};
      System.out.println(car.length);
      
      
      

		
		
	}

}
