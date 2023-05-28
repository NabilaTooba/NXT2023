package Morningpractice;

public class Abstractpractice2  extends Abstractpractice1{

	public static void main(String[] args) {
		
		
		Abstractpractice2 objnm= new Abstractpractice2();
		
		objnm.method1();
		objnm.method2();
		objnm.method3();
		objnm.method4();
		objnm.method5();
		
		
		

	}

	@Override
	public void method1() {
		System.out.println("practice makes a man perfect");
		
	}

	@Override
	public void method2() {
	     System.out.println("we should study at least 2 to 3 hours daily");
		
	}

	@Override
	public void method3() {
		System.out.println("I have a power to make impossible to possible");
		
	}

}
