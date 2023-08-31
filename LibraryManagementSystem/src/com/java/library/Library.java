package com.java.library;


//this class manage the library items

/*
  addItem(LibraryItem item): Add an item to the library.
 listAllItems(): Display information for all items.
 searchByTitle(String title): Search items by title.
 searchByAuthor(String author): Search items by author.
 */
public class Library {
	
	LibraryItem[] allItems; //show all LibraryItem which will be created from Main class
	
	//display all items using array??? for loop to display info each item 
	
	void addItem(LibraryItem item){
	
System.out.println("added a new item to LibraryItem!");		
	}
	
	void listAllItems() {
	for(LibraryItem item:allItems) {
		System.out.println("Title = " + item.getTitle() );
		System.out.println("Author = " + item.getAuthor());
		System.out.println("Year = " +item.getYear());
//what if the item is book or DVD...?
	}
		
		
	}
	//check the matching title of item if any available.....
 void searchByTitle(String title) {
	 //if avaiable and match item with that title... if not display a error msg
	 System.out.println(" The item with title "+ title );
	 
	 int count=0; //initial the number of the item with the title
	 for(LibraryItem i: allItems) {
		 if(i.getTitle().equals(title)){
			 count++;
			 System.out.println(count);
		 }
	 }System.out.println("there are " + count + "items with the title is " + title);
 }
 
 void searchByAuthor(String author) {
	 //similar with by title
	 int count=0;
	 for(LibraryItem item: allItems) {
		 if(author.equals(item.getAuthor())) {
			 count++;
			 
		 }
	 }System.out.println("There are " + count + "items with author is " + author);
 }

}
