package FactoryPattern;

public class Ship implements Transport {
    private Product product;

    public Ship(String product) {
        this.product = new Product(product);
        System.out.println("Product will be delivered by Ship");
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}
