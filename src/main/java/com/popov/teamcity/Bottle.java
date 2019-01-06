package com.popov.teamcity;

/**
 * Bottle
 */
public class Bottle {
    private final String type;
    private final Integer quantity;
    private double cost;


    public Bottle(String type, Integer quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType(){
        return type;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public double getCost(){
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    
    
}