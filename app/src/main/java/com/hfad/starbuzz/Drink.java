package com.hfad.starbuzz;

/**
 * Created by vibhav on 12/2/18.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;


    public static final Drink[] drinks = {
            new Drink("Latte", "Espresso shots steamed with milk", R.drawable.latte),
            new Drink("Cappucino","Espresso, hot milk and a steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter","Highest quality beans, roasted and fresh", R.drawable.filter),
    };


    private Drink(String name, String description, int imageResourceId){
        this.name = name;
        this.description  = description;
        this.imageResourceId = imageResourceId;
        }

    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }
}