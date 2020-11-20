package com.company;

public class Book {
   private String title;
   private int pages;
   private String genre;

   public String getGenre() {
      return genre;
   }

   public void setGenre(String genre) {
      this.genre = genre;
   }

   public void discribe(){
       System.out.println("The Book: " + title + " is " + pages + " long." + "\n"+
               "It is a " + genre + " book.");
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public int getPages() {
      return pages;
   }

   public void setPages(int pages) {
      this.pages = pages;
   }



}
