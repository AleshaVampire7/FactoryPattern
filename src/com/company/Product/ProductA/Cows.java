package com.company.Product.ProductA;

import com.company.Product.IProductB;

public class Cows implements IProductB {
    @Override
    public String whatdoesdweller() {
        return "Walking back and forth, giving milk, making a sound.";
    }
}
