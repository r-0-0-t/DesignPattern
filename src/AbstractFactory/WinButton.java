package AbstractFactory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Buttons painted Blue!");
    }
}
