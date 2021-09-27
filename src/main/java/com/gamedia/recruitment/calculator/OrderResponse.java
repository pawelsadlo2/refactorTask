package com.gamedia.recruitment.calculator;

import lombok.Setter;

import java.util.List;

@Setter
public class OrderResponse {
    private List<ProductResponse> product_list;
    private String accountType;

    public OrderResponse() {
    }

    public List<ProductResponse> getProduct_list() {
        return product_list;
    }

    public String getAccountType() {
        return accountType;
    }
}
