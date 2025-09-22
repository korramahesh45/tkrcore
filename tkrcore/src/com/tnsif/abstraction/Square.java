package com.tnsif.abstraction;

public class Square extends Shape {
	private int side=7;
	public Square(int side) {
		this.side=side;
	}
	void calArea() {
		super.area=area;
		area=side*side;
	}
}