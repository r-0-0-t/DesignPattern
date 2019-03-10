package AbstractFactory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Buttons painted White!");
    }
}
