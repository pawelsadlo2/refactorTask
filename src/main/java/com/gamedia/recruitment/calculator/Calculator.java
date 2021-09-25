package com.gamedia.recruitment.calculator;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public double calculate(String orderId, Double discount) {
        var restTemplate = new RestTemplateBuilder().build();
        var response = restTemplate.getForEntity("yourapi.com/api/v2/order/" + orderId, OrderResponse.class);
        if (response.getBody() == null) {throw new RuntimeException("null response body");}
        var sum = response.getBody().getProductList().stream().map(e -> e.getPrice() * e.getQuantity()).reduce(0d, Double::sum);
        if (sum > 1000) {sum = sum * 0.9;
        } else if (sum > 100) {sum = sum * 0.95;}
        if (response.getBody().getAccountType() == "NoAccountCustomer") {sum = sum * 1.03;
        } else if (response.getBody().getAccountType() == "PremiumCustomer") {sum = sum * 0.98;
        } else {throw new RuntimeException("unknown customer");}
        if (discount == null) {return sum;} else {return sum - discount;}
    }
}
