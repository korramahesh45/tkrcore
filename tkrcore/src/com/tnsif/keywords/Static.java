package com.tnsif.keywords;

class StaticProperities{
	
    // static variable
    static int number;

    // static block
    static {
        number = 10;
        System.out.println("Static block executed.");
    }

    // static method
    static void show() {
        System.out.println("Number is: " + number);
    }
}

public class Static {

	public static void main(String[] args) {
		StaticProperities.show();
	}

}