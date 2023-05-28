package javapractice;

public class Lec7inheritancechild extends Lec7inheritanceparent{

	//inheritance: we have to use extend keyword to access the parent class
	// we inherit parent class in child class by using extend keyword
	
	public static void main(String[] args) {
		// object: classname objectname=new classname();
		
		Lec7inheritancechild obj=new Lec7inheritancechild();
		System.out.println(obj.a);
		obj.method1(); 
		obj.method2();
		obj.method3();
		
		
		
		
	}

}
