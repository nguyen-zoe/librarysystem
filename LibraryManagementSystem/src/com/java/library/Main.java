package com.java.library;

public class Main {

	public static void main(String[] args) {
	

		Book b1 = new Book(200, "Horror", "Blue Sun", "Zoe", 2023);
		
		DVD d1 = new DVD("Hi Java","Unknown", 2000,95.0, "Steven Spielburg");
		
		System.out.println("For Book");
		b1.checkout();
		b1.returnItem();
		
		
		System.out.println("For DVD");
		d1.checkout();
		d1.returnItem();
		
		
	}

}
