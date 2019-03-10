package FactoryPattern;

public class Truck implements Transport {

    private Product product;

    public Truck(String product) {
        this.product = new Product(product);
        System.out.println("Product will be delivered by Truck");
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}
