//10.Java Program to demonstrate use of implementing interfaces 

interface Vehicle{
	void start();
	void sound();
}

class Car implements Vehicle{
	public void start(){
		System.out.println("car is starting.");
	}
	public void sound(){
		System.out.println("car is honking.");
	}
}

class Bike implements Vehicle{
	public void start(){
		System.out.println("bike is starting.");
	}
	public void sound(){
		System.out.println("bike is whooshing.");
	}
}

class InterfaceDemo{
	public static void main (String[] args){
		Vehicle myCar= new Car();
		myCar.start();
		myCar.sound();
                Vehicle myBike= new Bike();
		myBike.start();
		myBike.sound();

	}
}