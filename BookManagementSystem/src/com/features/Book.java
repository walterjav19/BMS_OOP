package com.features;

import java.util.Objects;

public class Book {
	
	private int isbn;
	private String title;
	private String author;
	private String genre;
	private double price;
	private int quantity;
	
	public Book(int isbn,String title, String author,  String genre, double price, int quantity) {
			this.isbn = isbn;	
			this.title = title;
			this.author = author;
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

	@Override
	public String toString() {
		return String.format("| %-15s | %-20s | %-20s | %-15s | %-10.2f | %-8d |", 
                isbn, title, author, genre, price, quantity);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return isbn == other.isbn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
