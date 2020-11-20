package com.company;

public class Main {

    public static void main(String[] args) {

        LibraryBook ScaryTimes = new LibraryBook();

        ScaryTimes.setGenre("Horror");
        ScaryTimes.setPages(489);
        ScaryTimes.setTitle("Scary Times");
        ScaryTimes.discribe();
        ScaryTimes.isPhysical(true);
        ScaryTimes.isRead(true);



    }
}
