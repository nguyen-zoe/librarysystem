package com.java.library;

public class DVD extends LibraryItem implements Borrowable, Playable{

	private double duration;
	private String director;
	
	
	public DVD() {
		super();
		
	}
	public DVD(String title, String author, int year, double duration, String director) {
		super(title, author, year);
		this.duration= duration;
		this.director= director;
	}
	
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String play() {
		
		return "DVD is playing!";
	}
	@Override
	public String stop() {
		
		return "DVD has stopped!!!";
	}
	@Override
	public void checkout() {
		System.out.println("You borrowed and checked out the item!");
		
	}
	@Override
	public void returnItem() {
	System.out.println("you has returned the DVDs");
		
	}
	
	
}
