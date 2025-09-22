package com.tnsif.abstraction;

public class AbstractKey {

	public static void main(String[] args) {
		Square s = new Square(4);
		s.calArea();
		s.show();
		Rectangle r = new Rectangle(3,4);
		r.calArea();
		r.show();
	}

}