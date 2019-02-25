package DecoratorPattern;

public class Cheese extends Decorator {
    public Cheese(Burger burger) {
        super(burger);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println(" Cheese Added!");
    }
}
