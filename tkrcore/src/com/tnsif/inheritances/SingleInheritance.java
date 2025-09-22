package com.tnsif.inheritances;

class Base{
	int a=10;
	public void display() {
		System.out.println("This is base class");
	}
}
class Derived extends Base{
	int b=20;
	public void show() {
		System.out.println("This is derived class");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Derived obj= new Derived();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.show();
		obj.display();
	}
}