package com.java.library;

public class LibraryItem {
	
	protected String title; //the title of the library item
	protected String author; //the author or creator of the item
	protected int year; //the publication year of the item
	
	public LibraryItem() {
	
	}
	
	
	public LibraryItem(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
