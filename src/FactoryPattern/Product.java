package FactoryPattern;

public class Product {
    private String product;

    public Product(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return (product + " was delivered!");
    }
}
