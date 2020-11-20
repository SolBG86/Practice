package com.company;

public class Main {

    public static void main(String[] args) {

        LibraryBook ScaryTimes = new LibraryBook();

        Book FunnyTimes = new LibraryBook();

        StoreBook OddTimes = new StoreBook();

        FunnyTimes.setTitle("Funny Times");
        FunnyTimes.setPages(230);
        FunnyTimes.setGenre("Comedy");
        FunnyTimes.discribe();

        System.out.println(System.lineSeparator());

        ScaryTimes.setGenre("Horror");
        ScaryTimes.setPages(489);
        ScaryTimes.setTitle("Scary Times");
        ScaryTimes.discribe();
        ScaryTimes.isPhysical(true);
        ScaryTimes.isRead(true);

        System.out.println(System.lineSeparator());

        OddTimes.setGenre("Mystery");
        OddTimes.setPages(679);
        OddTimes.setTitle("Odd Times");
        OddTimes.discribe();
        OddTimes.inLibrary(false);
        OddTimes.setDiscount(30);
        OddTimes.setDigitalPrice(100);
        OddTimes.setPhysicalPrice(120);
        OddTimes.isPhysical(false);
        OddTimes.onSale(true);


    }
}
