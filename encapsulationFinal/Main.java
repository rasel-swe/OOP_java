package encapsulationFinal;

import oop.Person;

public class Main {
	public static void main(String [] args) {
		Person p1 = new Person();
		
		p1.setName("Rasel");
		
		System.out.println("Name= "+p1.getName());
		
		p1.setAge(27);
		System.out.println("Age = "+p1.getAge());
	}

}
