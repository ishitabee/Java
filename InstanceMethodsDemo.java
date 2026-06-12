//5.Java Program to define a class, define instance methods for setting and retrieving values of instance variables and instantiate its object

class Employee {
	private String name;
	private int salary;

	//Setter methods
	void setName(String name){
		this.name=name;
	}

	void setSalary(int salary){
		this.salary=salary;
	}

	//Getter methods
	String getName(){
		return name;
	}

 	int getSalary(){
		return salary;
	}
}

class InstanceMethodsDemo{
	public static void main(String[] args){
		Employee emp= new Employee();
		emp.setName("Aditi");
		emp.setSalary(192107);
		
		System.out.println("Employee Name: "+ emp.getName());
		System.out.println("Employee Salary: "+ emp.getSalary());
	}
}