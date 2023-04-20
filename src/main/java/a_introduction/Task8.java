package a_introduction;

import java.time.Year;

public class Task8 {

    public static void main(String[] args) {
        double price = 100.0;
        double discount = 0.2;

        double discountedPrice = calculateDiscountedPrice(price, discount);
        System.out.println("Cena po rabacie: " + discountedPrice);
    }
    public static double calculateDiscountedPrice(double price, double discount) {
        double discountedPrice = price * (1 - discount);
        return discountedPrice;
    }

}
