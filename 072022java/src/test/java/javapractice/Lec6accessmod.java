package javapractice;

public class Lec6accessmod {

	int num=1;   //(default attribute)used default access modifier=accessible in any class of same package
	
	public String flower="rose"; //(public attribute)public access modifier accessible in any class of any package
	
	// how to create method. syntax will be
	
	//Method syntax: accessmodifier returntype method name (argument1,arg2){}
	
	public void fblogin(String email,String PW) {
		//block of code
		int a=6;
	}
	
	void method1() {
		//block of code
		System.out.println("this is a method");
	}
	
	//protected to access any protected attribute and method; we have to use extend keyword
	// means we have to use inheritance concept
	protected int number =10;
	protected void method3() {
		System.out.println("nexttechitc");
	}
	
	public static void main(String[] args) {
		
		//syntax of object
		//classname objectname=new classname ();
		
		Lec6accessmod obj=new Lec6accessmod();
		System.out.println(obj.flower);
		System.out.println(obj.num);
		
		

	}

}
