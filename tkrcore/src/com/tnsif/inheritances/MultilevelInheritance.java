package com.tnsif.inheritances;

//Parent class
class Student {
	 String college = "plus 2 in MPC ";
	 }

//Child class 1 inheriting Student
class Graduate extends Student {
	 String degree = "B.Tech in AIML";
	}

//Child class 2 inheriting Graduate
class Employee extends Graduate {
	 String company = "Microsoft";
	}

//Main class
public class MultilevelInheritance {
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("College: " + emp.college);     // from Student
		System.out.println("Degree: " + emp.degree);     // from Graduate
		System.out.println("Company: " + emp.company);   // from Employee
	}
}