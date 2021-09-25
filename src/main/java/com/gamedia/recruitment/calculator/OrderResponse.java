package com.gamedia.recruitment.calculator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OrderResponse {
    private List<ProductResponse> productList;
    private String accountType;
}
