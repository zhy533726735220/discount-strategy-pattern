package com.github.hcsp.polymorphism;

public class NoDiscountStrategy extends AbstractStrategy {

    @Override
    public int calculatePrice(int price, User user) {
        return price;
    }

}
