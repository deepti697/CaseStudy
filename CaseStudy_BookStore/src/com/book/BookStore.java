 package com.book;

import java.util.ArrayList;
import com.book.Exception.InvalidBookException;


public class BookStore extends Book {
	public BookStore() throws InvalidBookException {

	}
	static ArrayList<Book> arrlst = new ArrayList<Book>();

	public static void addBook(Book b) {
		arrlst.add(b);
	}
// to add book
	public static void displayAll() {
		for (Book element : arrlst) {
			System.out.println(element);
		}
	}

	//to search book by title
	public static void searchByTitle(String title) {
		boolean flag = false;
		for (Book element : arrlst) {
			String val = element.getTitle();
			if (val.contentEquals(title)) {
				System.out.println("Book Found");
				System.out.println(element);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("book not found with give title");
		}
	}

	//to search book by author
	public static void searchByAuthor(String a) {
		boolean flag = false;
		for (Book element : arrlst) {
			String val = element.getAuthor();
			if (val.contentEquals(a)) {
				System.out.println("Book Found");
				System.out.println(element);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("book not found with give author name");
		}

	}

	//to display specified book
	public static void displayBook(String specificbookID) {
		boolean flag = false;
		for (Book element : arrlst) {
			String val = element.getBookID();
			if (val.contentEquals(specificbookID)) {
				System.out.println("book found");
				System.out.println(element);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("book not found with give bookID");
		}
	}

	//to delete the book
	public static void deleteBook(String bookID) {
		boolean flag = false;

		for (Book element : arrlst) {
			String val = element.getBookID();
			if (val.contentEquals(bookID)) {

				arrlst.remove(element);
				System.out.println("book removed");
				flag = true;
				break;

			}
		}
		if (flag == false) {
			System.out.println("book do not exist");
		}

	}

	//to modify book details
	public static void modifyBook(String modifybookID, String bookset) {
		boolean flag = false;
		for (Book element : arrlst) {
			String val = element.getBookID();
			if (val.contentEquals(modifybookID)) {
				element.setBookID(bookset);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("book do not exist");
		}

	}

	

}