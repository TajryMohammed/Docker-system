package org.tajry;


public class Main {

    public static void main(String[] args) {

        OrderProcessor orderProcessor = new OrderProcessor();

        System.out.println(orderProcessor.calculateTotalPriceWithDiscount(10,20,15,true));


    }
}