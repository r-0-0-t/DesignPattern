package DecoratorPattern;

public class Bun extends Decorator {
    private int price;

    public Bun(int price) {
        this.price = price;
    }

    @Override
    public void decorate() {
        System.out.println(" Bun Added! Please Pay " + price );
    }
}
