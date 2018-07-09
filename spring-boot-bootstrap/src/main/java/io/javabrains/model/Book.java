package io.javabrains.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.javabrains.validation.ValidBook;

@Entity
public class Book {

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	/**
	 * @param id
	 * @param title
	 * @param author
	 */
	public Book(long id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public Book() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column (nullable = false, unique=true)
	@NotBlank(message="Name cannot be null")
	//@ValidBook(value = "")// to enable annotation validation 
	private String title;
	
	@Column (nullable = false)
	//@ValidBook(value = "")
	@NotBlank(message="Name cannot be null")
	private String author;
	}


