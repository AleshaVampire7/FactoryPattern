package com.company.Product;

public abstract class IProductA {
    private int size;
    private String does;

    public void setSize(int size) {
        this.size = size;
    }

    public void setDoes(String does) {
        this.does = does;
    }

    public int getSize() {
        return size;
    }

    public String getDoes() {
        return does;
    }
}
