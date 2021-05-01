package com.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Bookmark {
	
	@Id
	@SequenceGenerator(name="bookmarkId",initialValue=1 ,allocationSize=5)
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "bookmarkId")
	private int bookmarkId;
	@Column
	private String title;
	@Column
	private String url;
	@Column
	private String tag;
	public int getId() {
		return bookmarkId;
	}
	public void setId(int id) {
		this.bookmarkId = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "Bookmark [id=" + bookmarkId + ", title=" + title + ", url=" + url + ", tag=" + tag + "]";
	}
	
	
	

}
