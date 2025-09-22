package com.tnsif.interfaces;

public class Jio implements Phone{
	public void call() {
		System.out.println("This is jio class:");
		System.out.println("Call is recived from jio.");
	}
	
	public void sms() {
		System.out.println("Message is recived from jio.");
	}
}