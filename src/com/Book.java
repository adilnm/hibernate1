package com;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {
	private long id;
	private String title;
	private String description;
	private Date publishedDate;
	private Author author;

	public Book(String title, String description, Date publishedDate) {
		super();
		this.title = title;
		this.description = description;
		this.publishedDate = publishedDate;
	}

	public Book(String title, String description, Date publishedDate, Author author) {
		super();
		this.title = title;
		this.description = description;
		this.publishedDate = publishedDate;
		this.author = author;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AUTHOR_ID")
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Id
	@Column(name = "BOOK_ID")
	@GeneratedValue
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + ", publishedDate="
				+ publishedDate + "]";
	}

}
