package com.java.library;

public class Book extends LibraryItem implements Borrowable{

	private int pageNumber;
	private String genre;
	
	public Book() {
		//default constructor
	}
	

	public Book(int pageNumber, String genre,String title, String author, int year) {
		super(title, author, year);
		this.pageNumber = pageNumber;
		this.genre = genre;
	}


	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public void checkout() {
		System.out.println("You checked out successfully! Enjoy your reading");
		
	}


	@Override
	public void returnItem() {
		System.out.println("You returned items successfully! see you again");
		
	}
	
	
}
