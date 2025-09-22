package com.tnsif.interfaces;

public class Interface {

	public static void main(String[] args) {
		Jio j = new Jio();
		j.call();
		j.sms();
		
		Samsung s = new Samsung();
		s.call();
		s.sms();
	}

}
