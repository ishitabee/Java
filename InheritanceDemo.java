//8. Java Program to implement inheritance and demonstrate use of method overriding

class Animal {
	void sound(){
		System.out.println("Animals make sounds");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cow extends Animal {
	@Override	
	void sound(){
		System.out.println("Cow moos");
	}
}


class InheritanceDemo {
	public static void main (String[] args){
		Animal myAnimal= new Dog();
		myAnimal.sound();
		Animal hisAnimal= new Cow();
		hisAnimal.sound();
	}
}