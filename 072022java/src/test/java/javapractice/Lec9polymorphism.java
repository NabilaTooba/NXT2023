package javapractice;

public class Lec9polymorphism {
	
	//polymorphism have two method
	//method over loading and method over riding
	//method over riding: using the same method in different classes (duplicated method)
	// method over loading: we have same method name with different parameter
	
	public void fblogin(String email,String PW) {}
	
	public void fblogin(int phonenumber,String pw) {}
	
	public void fblogin() {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
