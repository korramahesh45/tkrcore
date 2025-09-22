package com.tnsif.gettersetter;

class Student {
	private String name;
	
	public void setName(String name) {
	    this.name = name;
	}
	
	public String getName() {
        return name;
    }
}

public class GetterSetter{
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Korra Mahesh");

        System.out.println("Student name: " + s.getName());
    }
}
