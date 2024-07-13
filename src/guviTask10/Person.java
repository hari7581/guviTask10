package guviTask10;

public class Person {

	private String name;
	private int age;

	// Create as Constructor
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Create getter method for name
	public String getName() {
		return name;
	}

	// Create getter method for age
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		Person person = new Person("Hari", 25);
		// Print the result
		System.out.println("Name : " + person.getName());
		System.out.println("Age : " + person.getAge());
	}

}
//
// Output :
//	 Name : Hari
//	 Age : 25
