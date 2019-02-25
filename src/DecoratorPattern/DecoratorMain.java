package DecoratorPattern;

public class DecoratorMain {
    public static void main(String[] args) {
        Burger burger = new Lettus(new Cheese(new Bun(100)));
        burger.decorate();
    }
}
