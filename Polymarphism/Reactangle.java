package Polymarphism;

public class Reactangle extends Shape{

	double length, width;
	
	Reactangle (double length, double width){
		this.length = length;
		this.width = width;
	}
	
	double area() {
		System.out.print("Area of Reactangle: ");
		return length*width;
	}
}
