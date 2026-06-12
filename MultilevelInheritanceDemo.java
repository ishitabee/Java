//9. Java Program to implement multilevel inheritance by applying various access controls to its data members and methods.

class Grandparent {
	protected String familyName= "Biswal";
}

class Parent extends Grandparent {
	protected void showFamilyName() {
		System.out.println("Family Name: " + familyName);
	}
}

class Child extends Parent {
	void display() {
		showFamilyName();
	}
}

class MultilevelInheritanceDemo{
	public static void main(String[] args){
		Child child= new Child();
		child.display();
	}
}