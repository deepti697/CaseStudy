
package com.bookutil;

import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;
import com.book.Exception.InvalidBookException;

public class BookUtil {

	 public static void main(String[] args) throws InvalidBookException {
		Scanner sc = new Scanner(System.in);
		String bookID;
		String title;
		String author;
		String category;
		float price;

		Book b;
		int choice = 0;
		
		System.out.println(" 1. Add Book \n 2. Modify Book \n 3. Delete Book \n 4. Display All \n 5. Display Specific Book \n 6. Search Book By title \n 7. Search Book By Author \n 8. Exit \n  ");
		System.out.print("Enter choice : ");
		choice = sc.nextInt();

		while (choice < 9) {
		
		switch (choice) {
		case 1:
			Book object = new Book();
			com.book.BookStore.addBook(object);
			System.out.println("List of Books !!!");
			com.book.BookStore.displayAll();
			break;
			
		case 2:
			System.out.print("Enter book id: ");
			String modifybookID = sc.next();
			System.out.print("Enter new book id: ");
			String bookset = sc.next();
			com.book.BookStore.modifyBook(modifybookID, bookset);
			
			break;
			
		case 3:
			System.out.print("Enter book id: ");
			String deletebookID = sc.next();
			com.book.BookStore.deleteBook(deletebookID);
			
			break;
		case 4:
			BookStore.displayAll();
			
			break;
			
		case 5:
			System.out.print("Enter book id: ");
			String specificbookID = sc.next();
			com.book.BookStore.displayBook(specificbookID);				
			
			break;
		case 6:
			System.out.print("Enter book title: ");
			String Title = sc.next();
			com.book.BookStore.searchByTitle(Title);
			
			break;
		case 7:
			System.out.print("Enter book author: ");
			String Author = sc.next();
			com.book.BookStore.searchByAuthor(Author);
			
			break;
		case 8:
			System.out.println("Thank you");
			System.exit(0);
			break;
		default:
			break;
		}
		
		System.out.println(
				"1.Add Book \n2.Modify Book \n3.Delete Book \n4.Display All Books \n5.Display Specific Book"
						+ "\n6.Search Book by Title \n7.Search Book by Author\n8.Exit");

		System.out.println("PROCESS COMPLETED");
		System.out.print("Enter Choice:");
		int ch = sc.nextInt();
		choice = ch;

	}
	System.out.println("PROGRAM END");

}
	

	
	
	
	
	
/*	
	
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bookID;
		String title;
		String author;
		String category;
		float price;
		
		Book b;

		for (int i = 0; i <= 2; i++) {

			System.out.println("Enter bookid = ");
			bookID = sc.nextLine();

			System.out.println("Enter title = ");
			title = sc.nextLine();

			System.out.println("Enter author = ");
			author = sc.nextLine();

			System.out.println("Enter category = ");
			category = sc.nextLine();

			System.out.println("Enter price = ");
			price = sc.nextFloat();
			sc.nextLine();

			try {
				b = new Book(bookID, title, author, category, price);
				BookStore.addBook(b);
			} catch (InvalidBookException e) {
				e.printStackTrace();
			}

		}

		BookStore.searchByTitle("Atomic Habits");
		BookStore.searchByAuthor("James Clear");

		BookStore.displayAll();

	}*/

}