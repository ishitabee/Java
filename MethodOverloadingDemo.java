//6. Java Program to define a class, define instance methods and overload them and use them for dynamic method invocation 

class MathOperations {
	//Method overloading
	int add(int a,int b){
		return a + b;
	}

	double add(double a, double b){
		return a + b;
	}
}

class MethodOverloadingDemo {
	public static void main(String[] args){
		MathOperations math= new MathOperations();
		System.out.println("Sum (int): "+ math.add(10,12));
		System.out.println("Sum(double): "+math.add(11.20,30.10));
	}
}