package com.tnsif.polymorphism;

class Animal{
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Dog barks");
	}
}
public class MethodOverRiding {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		Dog d = new Dog();
		d.sound();
	}

}