package com.pluralsight.models;
//pizza properties here
//size 8, 14, 16
//base price
//crust thin, regular, pan, cauliflower
//sauce marinara, pesto, bbq, buffalo
//meat pep, sausage, ham, meatball, bacon, chicken
//cheese mozz, parm, ricotta,


//listed properties
public class Pizza {
    private int size;
    private double basePrice;
    private String crust;
    private String sauce;
    private String meat;
    private String cheese;
    private String toppings;

    //created pizza constructor
    public Pizza(int size, double basePrice, String crust, String sauce, String meat, String cheese, String toppings) {
        this.size = size;
        this.basePrice = basePrice;
        this.crust = crust;
        this.sauce = sauce;
        this.meat = meat;
        this.cheese = cheese;
        this.toppings = toppings;

        //pricing based on pizza size
        if (size == 8) {
            basePrice = 8.50;
        } else if (size == 14) {
            basePrice = 12.00;
        } else if (size == 16) {
            basePrice = 16.50;
        } else {
            basePrice = 0;
            System.out.println("Invalid pizza size!");
        }
    }

    //pizza getter
    public double getBasePrice() {
        return basePrice;
    }

    public double calculatePrice() {
        return basePrice; // later you can add topping costs
    }

    public int getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public String getSauce() {
        return sauce;
    }

    public String getMeat() {
        return meat;
    }

    public String getCheese() {
        return cheese;
    }

    public String getToppings() {
        return toppings;
    }

   //calculate pizza order
    @Override
    public String toString() {
        return size + "\" Pizza\n" +
                "Crust: " + crust + "\n" +
                "Sauce: " + sauce + "\n" +
                "Meat: " + meat + "\n" +
                "Cheese: " + cheese + "\n" +
                "Toppings: " + toppings + "\n" +
                "Price: $" + basePrice;
    }
}
