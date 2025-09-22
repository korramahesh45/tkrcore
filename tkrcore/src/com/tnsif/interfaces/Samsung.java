package com.tnsif.interfaces;

public class Samsung implements Phone{
	public void call() {
		System.out.println("This is samsung class:");
		System.out.println("Call is recived from Samsung.");
	}
	
	public void sms() {
		System.out.println("Message is recived from Samsung.");
	}
}
