package inheritance;

public class Teacher extends Person {

	String qualification;
	
	void displayinformation2() {
		displayinformation1();
		System.out.println("Qualification = "+qualification);
	}
}
