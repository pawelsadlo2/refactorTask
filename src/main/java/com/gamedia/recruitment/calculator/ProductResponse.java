package com.gamedia.recruitment.calculator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductResponse {
    private String productId;
    private int quantity;
    private double price;
}
