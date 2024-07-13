package guviTask10;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	// Create the getter methods
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLirstName() {
		return lastName;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getSalary() {
		return salary;
	}

	// Create the setter method
	public void setSalary(int salary) {
		this.salary = salary;
	}

	// Method to calculate annual salary
	public int getAnnualSalary() {
		return salary * 12;
	}

	// Method to raise salary by a percentage
	public int raiseSalary(int percent) {
		if (percent > 0) {
			salary += salary * percent / 100;
		}
		return salary;
	}

	// create the toString Method
	public String toString() {
		return "Employee[ id = " + id + ", name = " + getName() + ", salary = " + salary + " ]";
	}

	public static void main(String[] args) {

		Employee emp = new Employee(01, "Hari", "haran", 45000);
		// Print the Result
		System.out.println(emp.toString());

		emp.raiseSalary(05);
		System.out.println("After raise, new salary: " + emp.getSalary());

		System.out.println("Annual Salary: " + emp.getAnnualSalary());

	}

}

// Output :
//	 Employee[ id = 1, name = Hari haran, salary = 45000 ]
//			 After raise, new salary: 47250
//			 Annual Salary: 567000
