package TODO;

public class if_else {

	public static void main(String[] args) {
		/*
		 * Ques: time=24; print good evening.
		 */
		
int time= 24;
if(time<9) {
	System.out.println("Good Morning");
}
else if(time>15){
	System.out.println("Good Evening");
}	
		
else{
	System.out.println("Good Night");
}
		

/*
 * It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+
 */
int mark=33;
if(mark>=80&& mark<=100) {
	System.out.println("Grade A+");
}
else if(mark>=70&& mark<=79) {
	System.out.println("Grade A");
}
else if(mark>=60&& mark<=69) {
	System.out.println("Grade B");
}
else if(mark>=50&& mark<=59){
	System.out.println("Grade c");
}
else if(mark>=40&& mark<=49) {
	System.out.println("Grade D");
}
else {
	System.out.println("Fail");
}
 








	}

}
