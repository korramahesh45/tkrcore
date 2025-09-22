package com.tnsif.abstraction;

public class Rectangle extends Shape {
	private int length,breadth;
	public Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void calArea() {
		area=length*breadth;
		super.area=area;
	}

}