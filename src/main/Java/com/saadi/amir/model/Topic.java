package com.saadi.amir.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Amir on 2016-10-11.
 * webstore
 */
@Entity
public class Topic {
	@Id
	@GeneratedValue
	private int id;
	
	private String title;
	private String content;
	private String author;
	private Date date;
	
	public Topic() {
	}
	
	public Topic(String title, String content, String author) {
		
		this.title = title;
		this.content = content;
		this.author = author;
		this.date = new Date();
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getId() {
		return id;
	}
	
	private void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getDate() {
		return date;
	}
	
}
