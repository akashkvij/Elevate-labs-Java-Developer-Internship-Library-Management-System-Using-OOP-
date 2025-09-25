package com.elevatelabs.internship;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	private static ArrayList<Book3> books=new ArrayList<>();
	private static ArrayList<User3> users=new ArrayList<>();
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		boolean con=true;
		int choice;
		while(con) {
			System.out.println("\\n===== Library Management System ====");
			System.out.println("1.Add Book");
			System.out.println("2.View Books");
			System.out.println("3.Add user");
			System.out.println("4.View user");
			System.out.println("5.Issue Book");
			System.out.println("6.Return Book");
			System.out.println("7.Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			if(choice==7) {
				System.out.println("----Exiting----");
				con=false;
				break;
			}
			switch(choice) {
			case 1: Addbook();
					break;
			case 2: Viewbook();
					break;
			case 3: Adduser();
					break;
			case 4: Viewuser();
					break;
			case 5: Issuebook();
					break;
			case 6: returnBook();
					break;
			}
		}
	}
	private static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int bookId = sc.nextInt();

        Book3 book = findBook3ById(bookId);
        if (book == null) {
            System.out.println(" Book not found!");
        } else if (!book.isIssued()) {
            System.out.println("This book was not issued!");
        } else {
            book.setIssued(false);
            System.out.println("Book '" + book.getBname() + "' returned successfully!");
        }
    }
	
	
	private static void Issuebook() {
		System.out.println("enter the bookid");
		int bookid=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the userid");
		int userid=sc.nextInt();
		
		Book3 book=findBook3ById(bookid);
		User3 user=findUser3ById(userid);
		
		  if (book == null) {
	            System.out.println("Book not found!");
	            return;
	        }
	        if (user == null) {
	            System.out.println("User not found!");
	            return;
	        }
	        if (book.isIssued()) {
	            System.out.println("Book already issued!");
	        } else {
	            book.setIssued(true);
	            System.out.println("Book '" + book.getBname() + "' issued to " + user.getName());
	        }
	}
	private static User3 findUser3ById(int userid) {
		 for (User3 b : users) {  
		        if (b.getUid() == userid) return b;
		 }
		return null;
	}
	private static Book3 findBook3ById(int bookid) {
		for(Book3 b:books) {
			if (b.getBid() == bookid) return b;
			
			
			
		}
		return null;
	}
	private static void Viewuser() {
		if(users.isEmpty()) {
			System.out.println("NO BOOKS FOUND");
		}
		else {
			for(User3 u:users) {
				System.out.println(u);
			}
		}
		
	}
	private static void Adduser() {
		System.out.println("enter the user id:");
		int uid=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the user name:");
		String uname=sc.nextLine();
		User3 u=new User3(uid,uname);
		users.add(u);
	}
	private static void Viewbook() {
		if(books.isEmpty()) {
			System.out.println("NO BOOKS FOUND");
		}
		else {
			for(Book3 b:books) {
				System.out.println(b);
			}
		}
	}
	private static void Addbook() {
		System.out.println("Enter the book id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the book name");
		String name=sc.nextLine();
		System.out.println("enter the Author name");
		String bname=sc.nextLine();
		Book3 b=new Book3(id,name,bname);
		books.add(b);
		
	}
	

}
