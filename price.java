package main1;

import java.util.Scanner;

public class price {

    final double originalprice = 37.68;
    private double pricebeverage, priceespresso, pricedrizzle, total_price;

    Scanner input = new Scanner(System.in);

    price(double A, double B) {

      
        this.pricebeverage = 37.68 + 0.00;
        this.priceespresso = 37.68 + 'A';
        this.pricedrizzle = 'A' + 'B';
        total_price = this.pricebeverage + this.priceespresso + this.pricedrizzle;

    }
   double getpricebeverage(){
    return this.pricebeverage;
}
   double getpriceespresso(){
       return this.priceespresso;
      
   }
   double getpricedrizzle(){
       return this.pricedrizzle;
   }
   double gettotalprice(){
       return this.total_price;
   }
}
