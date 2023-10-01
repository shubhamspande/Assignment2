package com.cdac.main;

import java.util.ArrayList;
import java.util.List;

class Book1 {

	  private String title;
	  private String author;
	  private boolean isAvailable;

	  public Book1(String title, String author) {
	    this.title = title;
	    this.author = author;
	    this.isAvailable = true;
	  }

	  public String getTitle() {
	    return title;
	  }

	  public String getAuthor() {
	    return author;
	  }

	  public boolean isAvailable() {
	    return isAvailable;
	  }

	  public void setAvailable(boolean available) {
	    isAvailable = available;
	  }

	} 
public class library {

	  private List<Book1> books;

	  public library() {
	    books = new ArrayList<Book1>();
	  }

	  public void addBook(Book1 book) {
	    books.add(book);
	  }

	  public Book1 checkOutBook(String title) {
	     for (Book1 book : books) {
	      if (book.getTitle().equals(title)) {
	        book.setAvailable(false);
	        return book;
	      }
	    }
	    return null;
	  }

	  public Book1 returnBook(Book1 book) {
	    book.setAvailable(true);
	    return book;
	  }

	 
	public static void main(String[] args) {
	

		library library = new library();
	
		Book1 book1 = new Book1("Harry potter", "J.k rolling");
		Book1 book2 = new Book1("The Hobbit", "J.R.R. Tolkien");
	
		library.addBook(book1);
		library.addBook(book2);
	
		Book1 checkedOutBook = library.checkOutBook("Harry potter");
		System.out.println("Checked out book: " + checkedOutBook.getTitle());
	
		library.returnBook(checkedOutBook);
		System.out.println("Book returned: " + checkedOutBook.getTitle());
	}
}