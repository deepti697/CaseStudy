package com.book;

import java.util.Scanner;
import com.book.Exception.InvalidBookException;


public class Book {

	private String bookID;
	private String title;
	private String author;
	private String category;
	private float price;

	Scanner sc = new Scanner(System.in);

	// default constructor of Book Object
	public Book() throws InvalidBookException {

		System.out.print("Enter bookid : ");
		this.bookID = sc.nextLine();
		//  Performing validation
		
		if (!(bookID.startsWith("B") && bookID.length() == 4)) {
			throw new InvalidBookException();
		}

		System.out.print("Enter book title : ");
		this.title = sc.nextLine();

		System.out.print("Enter book author : ");
		this.author = sc.nextLine();

		System.out.print("Enter book category : ");
		this.category = sc.nextLine();
		// validation
		if (!(category.contentEquals("Science")) && !(category.contentEquals("Fiction"))
				&& !(category.contentEquals("Technology")) && !(category.contentEquals("Others"))) {
			throw new InvalidBookException();
		}

		System.out.print("Enter book Price : ");
		this.price = sc.nextFloat();
		// validation
		if (price < 0) {
			throw new InvalidBookException();
		}

	}

	// parameterized constructor of Book object
	public Book(String bookID, String title, String author, String category, float price) {
		super();

		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	// creating getters
	public String getBookID() {
		return bookID;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCategory() {
		return category;
	}

	public float getPrice() {
		return price;
	}
	
	//creating setters
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}

}