package DecoratorPattern;

public class Lettus extends Decorator {
    public Lettus(Burger burger) {
        super(burger);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println(" Lettus Added!");
    }
}
