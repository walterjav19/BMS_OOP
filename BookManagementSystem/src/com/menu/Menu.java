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
		
		Book book = new Book(123456,"Java", "Deitel",  "Programming", 100.0, 1);
		Book book2 = new Book(1234567,"Python", "Deitel",  "Programming", 100.0, 10);
		Book book3 = new Book(1234568,"C#", "Deitel",  "Programming", 100.0, 10);
		Book book4 = new Book(12345689,"C#", "Deitel",  "Programming", 100.0, 10);
		
		Inventory.addBook(book);
		Inventory.addBook(book2);
		Inventory.addBook(book3);
		Inventory.addBook(book4);
		
	}
	
	private void WaitEnter() {
		Scanner n = new Scanner(System.in);
		n.nextLine();
	}
	
	private void showAllBooks() {
	   System.out.println("---------------------------------------------------------------------------------------------------------");
	    System.out.println("| ISBN            | TITLE               | AUTHOR              | GENRE          | PRICE      | QUANTITY  |");
	    System.out.println("---------------------------------------------------------------------------------------------------------");
		Inventory.showBooks();
		WaitEnter();
	}
	
	
	
	private void displayMenu() {
		System.out.println("------------------------");
		System.out.println("|BOOK MANAGEMENT SYSTEM|");
		System.out.println("------------------------");
		System.out.println("|      1. ADD BOOK     |");
		System.out.println("|      2. UPDATE BOOK  |");
		System.out.println("|      3. REMOVE BOOK  |");
		System.out.println("|      4. SEARCH       |");
		System.out.println("|      5. PURCHASE     | ");
		System.out.println("|      6. EXIT         |");
		System.out.println("------------------------");
	}
	
	private void displayRemoveBook() {
		System.out.println("Enter ISBN: ");
		String isbn = scanner.next();
		
		if (!isbn.matches("[0-9]+")) {
			System.out.println("\nInvalid ISBN, must be numbers\n");
			WaitEnter();
			return;
		}
		
		Book book = Inventory.SearchByIsbn(Integer.parseInt(isbn));
		if (book != null) {
			Inventory.removeBook(book);
			System.out.println("Book removed successfully");
		} else {
			System.out.println("Book does not exist");
		}
		WaitEnter();
		
	}
	
	private void Byisbn() {
		System.out.println("Enter ISBN: ");
		String isbn = scanner.next();

		if (!isbn.matches("[0-9]+")) {
			System.out.println("\nInvalid ISBN, must be numbers\n");
			WaitEnter();
			return;
		}

		Book book = Inventory.SearchByIsbn(Integer.parseInt(isbn));
		if (book != null) {
			System.out.println("\nBook found: " + book.getTitle());
			System.out.println("Author: " + book.getAuthor());
			System.out.println("Genre: " + book.getGenre());
			System.out.println("Price: " + book.getPrice());
			System.out.println("Quantity: " + book.getQuantity()+"\n");
		} else {
			System.out.println("Book does not exist");
		}
		WaitEnter();
	}
	
	private void Bytitle() {
		System.out.println("Enter Title: ");
		String title = scanner.next();

		if (title.isEmpty()) {
			System.out.println("\nInvalid Title, must not be empty\n");
			WaitEnter();
			return;
		}
		
		   System.out.println("---------------------------------------------------------------------------------------------------------");
		    System.out.println("| ISBN            | TITLE               | AUTHOR              | GENRE          | PRICE      | QUANTITY  |");
		    System.out.println("---------------------------------------------------------------------------------------------------------");
			Inventory.showBooksByTitle(title);
			WaitEnter();

	}
	
	private void ByAuthor() {
		System.out.println("Enter Author: ");
		String author = scanner.next();

		if (author.isEmpty()) {
			System.out.println("\nInvalid Author, must not be empty\n");
			WaitEnter();
			return;
		} else if (!author.matches("[a-zA-ZÑñ ]+")) {
			System.out.println("\nInvalid Author, must not contain only letters\n");
			WaitEnter();
			return;
		}

		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		System.out.println(
				"| ISBN            | TITLE               | AUTHOR              | GENRE          | PRICE      | QUANTITY  |");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		Inventory.showBooksbyAuthor(author);
		WaitEnter();
	}
	
	private void ByGenre() {
		System.out.println("Enter Genre: ");
		String genre = scanner.next();

		if (genre.isEmpty()) {
			System.out.println("\nInvalid Genre, must not be empty\n");
			WaitEnter();
			return;
		} else if (!genre.matches("[a-zA-ZÑñ ]+")) {
			System.out.println("\nInvalid Genre, must not contain only letters\n");
			WaitEnter();
			return;
		}

		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		System.out.println(
				"| ISBN            | TITLE               | AUTHOR              | GENRE          | PRICE      | QUANTITY  |");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		Inventory.ShowBooksByGenre(genre);
		WaitEnter();
	}
	
	private void displaySearchMenu() {
		System.out.println("------------------------");
		System.out.println("|      SEARCH MENU     |");
		System.out.println("------------------------");
		System.out.println("|      1. BY ISBN      |");
		System.out.println("|      2. BY TITLE     |");
		System.out.println("|      3. BY AUTHOR    |");
		System.out.println("|      4. BY GENRE     |");
		System.out.println("|      5.SHOW ALL BOOKS|");
		System.out.println("------------------------");
		System.out.print("Select an option:  ");
		int searchOption = scanner.nextInt();
		
		switch(searchOption) {
		case 1:
			Byisbn();
			break;
		case 2:
			Bytitle();
			break;
		case 3:
			ByAuthor();
			break;
		case 4:
			ByGenre();
			break;
		case 5:
			showAllBooks();
			break;
		default:
			System.out.println("No valid option");
			break;
		}
		
		
	}
	
	
	
	private void MenuAdd() {
        System.out.println("============ADD=============");
       
        System.out.println("Enter ISBN: ");
        String isbn = scanner.next();
        scanner.nextLine();  // Consumir el salto de línea
        
       if(!isbn.matches("[0-9]+")) {
			System.out.println("\nInvalid ISBN, must be numbers\n");
			WaitEnter();
			return;
       }

        System.out.println("Enter Title: ");
        String title = scanner.nextLine();
        
        if(title.isEmpty()) {
        	    System.out.println("\nInvalid Title, must not be empty\n");
        	    WaitEnter();
        	    return;
        }

        System.out.println("Enter Author: ");
        String author = scanner.nextLine();
        
		if (author.isEmpty()) {
			System.out.println("\nInvalid Author, must not be empty\n");
			WaitEnter();
			return;
		}else if(!author.matches("[a-zA-ZÑñ ]+")) {
			System.out.println("\nInvalid Author, must not contain only letters\n");
			WaitEnter();
			return;
		}

        System.out.println("Enter Genre: ");
        String genre = scanner.nextLine();
        
        if(genre.isEmpty()) {
        	    System.out.println("\nInvalid Genre, must not be empty\n");
        	    WaitEnter();
        	    return;
        }else if(!genre.matches("[a-zA-ZÑñ ]+")) {
	            System.out.println("\nInvalid Genre, must not contain only letters\n");
	            WaitEnter();
        }

        System.out.println("Enter Price: ");
        double price = scanner.nextDouble();
        
		if (price <= 0) {
			System.out.println("\nInvalid Price, must be greater than 0\n");
			Scanner n=new Scanner(System.in);
			WaitEnter();
			return;
		}
        
        
        System.out.println("Enter Quantity: ");
        int quantity = scanner.nextInt();
        
		if (quantity <= 0) {
			System.out.println("\nInvalid Quantity, must be greater than 0\n");
			Scanner n=new Scanner(System.in);
			WaitEnter();
			return;
		}
        
		

       
        
        
		Book book = new Book(Integer.parseInt(isbn),title,author,genre,price,quantity);// object that will be insert
		
		boolean add=Inventory.addBook(book); // this flag help me to verify if the book was added
		
		if(add) {
			System.out.println("Book added successfully");
		}else {
            System.out.println("Book already exists");
        }
		
		WaitEnter();
		
		
		
		
		
	}
	
	private void UpdateBook() {
		System.out.println("Enter ISBN: ");
		
		String isbn = scanner.next();
		
		if (!isbn.matches("[0-9]+")) {
			System.out.println("\nInvalid ISBN, must be numbers\n");
			WaitEnter();
			return;
		}
		
		Book book = Inventory.SearchByIsbn(Integer.parseInt(isbn));
		
		if (book == null) {
			System.out.println("Book does not exist");
			WaitEnter();
			return;
		}
		
		System.out.println("1. Book found: "+book.getTitle());
		System.out.println("2. Book author: "+book.getAuthor());
		System.out.println("3. Book genre: "+book.getGenre());
		System.out.println("4. Book price: "+book.getPrice());
		System.out.println("5. Book quantity: "+book.getQuantity()+"\n");
		
		System.out.print("Select what you want to update: ");
		int updateOption = scanner.nextInt();
		
		switch(updateOption) {
			case 1:
				System.out.println("Enter new title: ");
				String title = scanner.next();
				if (title.isEmpty()) {
					System.out.println("\nInvalid Title, must not be empty\n");
					WaitEnter();
					return;
				}
				
				book.setTitle(title);
				System.out.println("Title updated successfully");
				break;
			case 2:
				System.out.println("Enter new author: ");
				String author = scanner.next();
				
				if (author.isEmpty()) {
                    System.out.println("\nInvalid Author, must not be empty\n");
                    WaitEnter();
                    return;
				}else if(!author.matches("[a-zA-ZÑñ ]+")) {
                    System.out.println("\nInvalid Author, must not contain only letters\n");
                    WaitEnter();
                    return;
                }
				
				book.setAuthor(author);
				System.out.println("Author updated successfully");
				break;
			case 3:
				System.out.println("Enter new genre: ");
				String genre = scanner.next();
				
				if (genre.isEmpty()) {
					System.out.println("\nInvalid Genre, must not be empty\n");
					WaitEnter();
					return;
				} else if (!genre.matches("[a-zA-ZÑñ ]+")) {
					System.out.println("\nInvalid Genre, must not contain only letters\n");
					WaitEnter();
					return;
				}
				
				book.setGenre(genre);
				Inventory.setGenre(genre);
				System.out.println("Genre updated successfully");
				break;
			case 4:
				System.out.println("Enter new price: ");
				double price = scanner.nextDouble();
				
				if (price <= 0) {
					System.out.println("\nInvalid Price, must be greater than 0\n");
					WaitEnter();
					return;
				}
				
				book.setPrice(price);
				Inventory.setPrice(book.getIsbn(), book.getPrice());
				
				System.out.println("Price updated successfully");
				break;
			case 5:
				System.out.println("Enter new quantity: ");
				int quantity = scanner.nextInt();
				
				book.setQuantity(quantity);
				
				
				if (quantity <= 0) {
					System.out.println("\nInvalid Quantity, must be greater than 0\n");
					WaitEnter();
					return;
				}
				
				System.out.println("Quantity updated successfully");
				break;
		}
		
		
	}
	
	
	private void Purchase() {
		   	System.out.println("---------------------------------------------------------------------------------------------------------");
		    System.out.println("| ISBN            | TITLE               | AUTHOR              | GENRE          | PRICE      | QUANTITY  |");
		    System.out.println("---------------------------------------------------------------------------------------------------------");
			Inventory.showBooks();
			System.out.println("Enter ISBN: ");
			
			String isbn = scanner.next();
			
			if (!isbn.matches("[0-9]+")) {
				System.out.println("\nInvalid ISBN, must be numbers\n");
				WaitEnter();
				return;
			}
			
			Book book = Inventory.SearchByIsbn(Integer.parseInt(isbn));
			if(book.removeQuantity(1)) {
				System.out.println("\nBook purchased successfully!!!");
			}else {
				System.out.println("\nBook not in Stock");
			}
			
			WaitEnter();

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
                    UpdateBook();
                    break;
                case 3:
                	displayRemoveBook(); 
                    break;
                case 4:
                    displaySearchMenu();
                    break;
                case 5:
                	Purchase();
                	break;
                case 6:
                    Exit();
                    break;
                default:
                    System.out.println("No valid option");
                    break;
            }
        } while (option != 6);
		}
}
