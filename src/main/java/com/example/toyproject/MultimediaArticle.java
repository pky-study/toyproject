package com.example.toyproject;

import java.util.ArrayList;

public class MultimediaArticle extends Article {
     private ArrayList<String> images;
     
     public MultimediaArticle(String author, String title, String content) {
    	super(author, content, content);
    	this.images = images;
     }
     
     public ArrayList<String> getImages() {
         return this.images;
     }

     public void setImages(ArrayList<String> images) {
         this.images = images;
     }
     
     @Override
     public String toString() {
     	return super.toString();
     }
     
}
