package com.gamedia.recruitment.calculator;

import lombok.Setter;

@Setter
public class ProductResponse {
    private String productId;
    private int quantity;
    private double price;

    public ProductResponse() {
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
