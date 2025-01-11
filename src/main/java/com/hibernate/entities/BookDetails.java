package com.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_details")
public class BookDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Book_id")
	private Long id;
	@Column(name = "book_name")
	private String name;
	private String author;
	private String genre;
	private String seller;
	
	//**********CONSTRUCTORS*************
	public BookDetails() {
		super();
	}
	
	public BookDetails(String name, String author, String genre, String seller) {
		super();
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.seller = seller;
	}

	
	//************GETTERS AND SETTERS*************
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	
	//***********toString()************
	@Override
	public String toString() {
		return "BookDetails [id=" + id + ", name=" + name + ", author=" + author + ", genre=" + genre + ", seller="
				+ seller + "]";
	}
	
}
