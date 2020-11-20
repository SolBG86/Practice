package com.company;

public class LibraryBook extends Book implements Booker {

   // private boolean r;
    //private boolean p;

    @Override
    public void isRead(boolean r) {

        if (r == true){
            System.out.println("You've read this book.");
        }else{
            System.out.println("You've not read this book.");
        }

    }

    @Override
    public void isPhysical(boolean p) {
        if (p == true){
            System.out.println("This book is a Physical copy.");
        }else{
            System.out.println("This is an E-Book.");
        }
    }


}
