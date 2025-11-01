package org.tajry;


import java.util.logging.Logger;

public class Main {

    static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {



        OrderProcessor orderProcessor = new OrderProcessor();


        double result = orderProcessor.calculateTotalPriceWithDiscount(10,20,15,true);

        logger.info("Result is : " + result);

    }
}