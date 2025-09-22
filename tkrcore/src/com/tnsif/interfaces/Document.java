package com.tnsif.interfaces;

class Document implements Printable, Showable {
	
	public void print() {
		System.out.println("This is printable method:");
		System.out.println("Document is printing.");
	}

	public void show() {
		System.out.println("This is showable method:");
		System.out.println("Document is showing.");
	}
}
