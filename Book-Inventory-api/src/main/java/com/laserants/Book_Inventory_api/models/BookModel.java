package com.laserants.Book_Inventory_api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Book")
public class BookModel {

	@Id
	@Column(name = "ISBN")
	private Long id;
	
	@Column
	private String title;

	
	@Column
	private Double price;
	
	@Column
	private Integer quantity;
	
	
	// asi manejamos las llaves foraneas
    @ManyToOne
    @JoinColumn(name = "editorial_id")
    private EditorialModel editorial;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private GenreModel genre;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorModel author;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public EditorialModel getEditorial() {
		return editorial;
	}

	public void setEditorial(EditorialModel editorial) {
		this.editorial = editorial;
	}

	public GenreModel getGenre() {
		return genre;
	}

	public void setGenre(GenreModel genre) {
		this.genre = genre;
	}

	public AuthorModel getAuthor() {
		return author;
	}

	public void setAuthor(AuthorModel author) {
		this.author = author;
	}
	

}
