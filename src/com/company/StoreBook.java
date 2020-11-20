package com.company;

public class StoreBook extends Book implements Booker, PriceMaker {

    double digitalPrice;
    double physicalPrice;
    int discount = 0;

    @Override
    public void isRead(boolean r) {

        if (r){
            System.out.println("You've read this book.");
        }else{
            System.out.println("You've not read this book.");
        }

    }

    @Override
    public void isPhysical(boolean p) {
        if (p){
            System.out.println("This book is a Physical copy.");
        }else{
            System.out.println("This is an E-Book.");
        }
    }

    public double getDigitalPrice() {
        return digitalPrice;
    }

    public void setDigitalPrice(double digitalPrice) {
        this.digitalPrice = digitalPrice;
    }

    public double getPhysicalPrice() {
        return physicalPrice;
    }

    public void setPhysicalPrice(double physicalPrice) {
        this.physicalPrice = physicalPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public void inLibrary(boolean libB) {
        if(libB){
            digitalPrice = 0;
            physicalPrice = 0;
        }
    }

    @Override
    public void onSale(boolean saleB) {

        if(saleB){

            digitalPrice = digitalPrice - ((discount / digitalPrice) * 100) ;
            System.out.println("This book is " + discount + " % off." + System.lineSeparator() +
                    "it worth " + digitalPrice + " for digital copy.");

            physicalPrice = physicalPrice - ((discount / physicalPrice) * 100);
            System.out.println("This book is " + discount + " % off." + System.lineSeparator() +
                    "it worth " + physicalPrice + " for physical copy.");
        }

    }

}
