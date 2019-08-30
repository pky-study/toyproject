package com.example.toyproject;

import java.time.LocalDateTime;

public class Article {
	private int articleId;
    private String author;
    private String title;
    private String content;
    private LocalDateTime writeDate;
    
    public Article() {
    	
    }
    
    public Article(	String author, String title, String content) {
    	this.author = author;
    	this.title = title;
    	this.content = content;
    }
    
    public int getArticleId() {
        return this.articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }
    
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    public LocalDateTime getWriteDate() {
        return this.writeDate;
    }

    public void setWriteDate(LocalDateTime writeDate) {
        this.writeDate = writeDate;
    }
        
    public String toString() {
    	return super.toString();
    }

}
