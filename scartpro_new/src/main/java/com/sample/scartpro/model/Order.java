package com.sample.scartpro.model;

import java.util.List;

public class Order {
    private User user;
    private List<CartItem> orderItems;
    private double totalPrice;
    private String shippingAddress;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<CartItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<CartItem> orderItems) {
        this.orderItems = orderItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Order(User user, List<CartItem> orderItems, double totalPrice, String shippingAddress) {
        this.user = user;
        this.orderItems = orderItems;
        this.totalPrice = totalPrice;
        this.shippingAddress = shippingAddress;
    }
}
