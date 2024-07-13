package guviTask10;

public class Circle {

	private double radius;

	// No-argument constructor
	Circle() {
		this.radius = 0.0;
	}

	// Constructor with argument
	Circle(double radius) {
		this.radius = radius;
	}

	// Method to calculate circumference
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public static void main(String[] args) {
		// Creating a circle with no-argument constructor
		Circle circle = new Circle();
		// Print the result
		System.out.println("Circle Radius : " + circle.getRadius());
		System.out.println("Circle1 Circumference : " + circle.getCircumference());

		// Creating a circle with argument constructor
		Circle circle1 = new Circle(8.0);
		// Print the result
		System.out.println("Circle1 Radius : " + circle1.getRadius());
		System.out.println("Circle1 Circumference : " + circle1.getCircumference());

	}

}

// Output :
//	 Circle Radius : 0.0
//	 Circle1 Circumference : 0.0
//	 Circle1 Radius : 8.0
//	 Circle1 Circumference : 50.26548245743669
