package com.features;

public class Book {
	
	private String title;
	private String author;
	private int isbn;
	private String genre;
	private double price;
	private int quantity;
	
	public Book(String title, String author, int isbn, String genre, double price, int quantity) {
			this.title = title;
			this.author = author;
			this.isbn = isbn;
			this.genre = genre;
			this.price = price;
			this.quantity = quantity;
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

	public int getIsbn() {
			return isbn;
	}

	public void setIsbn(int isbn) {
			this.isbn = isbn;
	}

	public String getGenre() {
			return genre;
	}

	public void setGenre(String genre) {
			this.genre = genre;
	}

	public double getPrice() {
			return price;
	}

	public void setPrice(double price) {
			this.price = price;
	}

	public int getQuantity() {
			return quantity;
	}

	public void setQuantity(int quantity) {
			this.quantity = quantity;
	}
	
	
	
	
	
	
	
}
