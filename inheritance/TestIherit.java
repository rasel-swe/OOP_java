package inheritance;

public class TestIherit {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		
			t1.name = "Md Mohammad Khan";
			t1.age = 30;
			t1.qualification = "Msc in SWE";
			t1.displayinformation2();
			
			
			t1.name = "Sheikh Rasel";
			t1.age = 21;
			t1.qualification = "Bsc in SWE";
			t1.displayinformation2();
	}
}
