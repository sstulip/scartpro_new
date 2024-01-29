package com.sample.scartpro.model;

public class User {
    private int id;
    private String name;
    private String email;
    private ShoppingCart shoppingCart;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public User(int id, String name, String email, ShoppingCart shoppingCart) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.shoppingCart = shoppingCart;
    }
}
