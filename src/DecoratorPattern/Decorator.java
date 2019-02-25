package DecoratorPattern;

public class Decorator implements Burger {
    Burger burger;

    public Decorator() {
    }

    public Decorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public void decorate() {
        burger.decorate();
    }
}
