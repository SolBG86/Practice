package com.company;

public abstract class Book {
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
       System.out.println("The Book: " + title + " is " + pages + " pages long." + System.lineSeparator() +
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
