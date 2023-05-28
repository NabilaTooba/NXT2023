package Morningpractice;

public class Arraymorningpractice {

	public static void main(String[] args) {
	
		
		//Array= store multiple value in single variable.
		//Syntax: datatype[]variablename={value1, value2, value3...value n}; (for integer)
        //Syntax: datatype[]variablename={"value1","value2","value3",..."value n"};   (for String)
		
		//store 3 cars by using array
		String[]car= {"bmw","honda","jeep"};
		
		//store 3 whole number by using Array
		int[]number= {100,200,300};
		
		//Access cars by using Array
		//access according to index 
		String[]cars= {"bmw","honda","jeep"};
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		
		//change cars by using Array
		cars[0]="ford";
		System.out.println(cars[0]);
		
		//length of Array
		System.out.println(cars.length);
		
		
	}

}
