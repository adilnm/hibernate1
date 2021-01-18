package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // table created will be classname
//@Table(name = "AUTHOR")
public class Author {
	private long id;
	private String name;
	private String email;

	//
	public Author() {
	}

	public Author(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Id
	// @Column(name = "AUTHOR_ID")//the column name created for primary key is now
	// AUTHOR-ID(not id)
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
