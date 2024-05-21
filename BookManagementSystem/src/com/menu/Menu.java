package com.menu;

import java.util.Scanner;

import com.features.Book;
import com.features.BookInventory;

public class Menu {
	private Scanner scanner; 
	private int option;
	private  BookInventory Inventory;
	
	public Menu() {
		this.scanner= new Scanner(System.in);
		this.option=0;
		this.Inventory=new BookInventory();
		
	}
	
	private void displayMenu() {
		System.out.println("------------------------");
		System.out.println("|BOOK MANAGEMENT SYSTEM|");
		System.out.println("------------------------");
		System.out.println("|      1. ADD BOOK     |");
		System.out.println("|      2. UPDATE BOOK  |");
		System.out.println("|      3. REMOVE BOOK  |");
		System.out.println("|      4. SEARCH       |");
		System.out.println("|      5. EXIT         |");
		System.out.println("------------------------");
	}
	
	private void MenuAdd() {
        System.out.println("============ADD=============");
       
        System.out.println("Enter ISBN: ");
        String isbn = scanner.next();
        scanner.nextLine();  // Consumir el salto de línea
        
       if(!isbn.matches("[0-9]+")) {
			System.out.println("\nInvalid ISBN, must be numbers\n");
			scanner.nextLine();// to wait until enter
			return;
       }

        System.out.println("Enter Title: ");
        String title = scanner.nextLine();
        
        if(title.isEmpty()) {
        	    System.out.println("\nInvalid Title, must not be empty\n");
        	    scanner.nextLine();// to wait until enter
        	    return;
        }

        System.out.println("Enter Author: ");
        String author = scanner.nextLine();
        
		if (author.isEmpty()) {
			System.out.println("\nInvalid Author, must not be empty\n");
			scanner.nextLine();// to wait until enter
			return;
		}else if(!author.matches("[a-zA-ZÑñ ]+")) {
			System.out.println("\nInvalid Author, must not contain only letters\n");
			scanner.nextLine();// to wait until enter
			return;
		}

        System.out.println("Enter Genre: ");
        String genre = scanner.nextLine();
        
        if(genre.isEmpty()) {
        	    System.out.println("\nInvalid Genre, must not be empty\n");
        	    scanner.nextLine();// to wait until enter
        	    return;
        }else if(!genre.matches("[a-zA-ZÑñ ]+")) {
	            System.out.println("\nInvalid Genre, must not contain only letters\n");
	            scanner.nextLine();// to wait until enter
        }

        System.out.println("Enter Price: ");
        double price = scanner.nextDouble();
        
		if (price <= 0) {
			System.out.println("\nInvalid Price, must be greater than 0\n");
			Scanner n=new Scanner(System.in);
			n.nextLine();// to wait until enter
			return;
		}
        
        
        System.out.println("Enter Quantity: ");
        int quantity = scanner.nextInt();
        
		if (quantity <= 0) {
			System.out.println("\nInvalid Quantity, must be greater than 0\n");
			Scanner n=new Scanner(System.in);
			n.nextLine();// to wait until enter
			return;
		}
        
		

       
        
        
		Book book = new Book(Integer.parseInt(isbn),title,author,genre,price,quantity);
		Inventory.addBook(book);
		
		Inventory.showBooks();
		
	}
	
	private void Exit() {
		System.out.println("\nGoodbye!");
	}
	
	public void StartMenu() {
		do {
			displayMenu();
			System.out.print("Select an option:  ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                   MenuAdd();
                    break;
                case 2:
                    
                    break;
                case 3:
                  
                    break;
                case 4:
                    
                    break;
                case 5:
                    Exit();
                    break;
                default:
                    System.out.println("No valid option");
                    break;
            }
        } while (option != 5);
		}
}
