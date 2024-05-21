package com.features;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BookInventory {
		private Set<Book> books;
		private Map<Integer, Double> Prices;
		private Set<String> Genres;
		
		public BookInventory() {
			this.books = new HashSet<Book>();
			this.Prices = new HashMap<Integer, Double>();
			this.Genres = new HashSet<String>();
		}
		
		public boolean addBook(Book book) {
			if (!this.books.contains(book)) {
				this.books.add(book);
				this.Prices.put(book.getIsbn(), book.getPrice());
				this.Genres.add(book.getGenre());
				return true;
			}else{
				return false;
			}
		}
		
		public void removeBook(Book book) {
			if (this.books.contains(book)) {
				this.books.remove(book);
				this.Prices.remove(book.getIsbn());
			} else {
				System.out.println("Book does not exist");
			}
		}
		

		
		public Book SearchByIsbn(int id) {
			for (Book book : this.books) {
				if (book.getIsbn() == id) {
					return book;
				}
			}
			return null;
		}
		
		
		
		public void showBooks() {
			this.books.forEach(
					book ->{
						System.out.println(book.toString());
					    System.out.println("---------------------------------------------------------------------------------------------------------");
					}
					);
		}
		
		public void showGenres() {
			this.Genres.forEach(genre -> {
				System.out.println(genre);
			});
		}
		

		
		public void showPrices() {
			this.Prices.forEach((isbn, price) -> {
				System.out.println(isbn + ":" + price);
			});
		}
}
