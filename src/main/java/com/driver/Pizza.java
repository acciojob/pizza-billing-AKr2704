package com.driver;

public class Pizza {

    private int totalPrice;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private int cheesePrice;
    private int toppingsPrice;
    private int paperBagPrice;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeaway;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true) {
            basePrice = 300;
            toppingsPrice = 70;
        }
        else {
            basePrice = 400;
            toppingsPrice = 120;
        }
        cheesePrice = 80;
        paperBagPrice = 20;
        totalPrice = basePrice;
        bill = "Base Price Of The Pizza: "+totalPrice+"\n";
    }

    public int getPrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false) {
            totalPrice =  totalPrice + cheesePrice;
            isCheeseAdded = true;
            bill = bill + "Extra Cheese Added: " +cheesePrice+"\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false) {
            totalPrice =  totalPrice + toppingsPrice;
            isToppingsAdded = true;
            bill = bill + "Extra Toppings Added: " +toppingsPrice+"\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeaway==false) {
            isTakeaway = true;
            totalPrice =  totalPrice + paperBagPrice;
            bill = bill + "Paperbag Added: " +paperBagPrice+"\n";
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false) {
            isBillGenerated = true;
            bill = bill + "Total Price: " +totalPrice+"\n";
        }
        return this.bill;
    }
}
