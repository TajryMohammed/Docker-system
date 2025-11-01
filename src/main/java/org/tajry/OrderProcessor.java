package org.tajry;

public class OrderProcessor {

    public double calculateTotalPriceWithDiscount(double unitPrice, double quantity, double discountRate, boolean isInStock) {
        double totalPrice = unitPrice * quantity;
        if (isInStock) {
            totalPrice = totalPrice - (totalPrice * discountRate);
        }
        return totalPrice;
    }
}
