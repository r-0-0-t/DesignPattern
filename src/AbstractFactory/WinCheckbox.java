package AbstractFactory;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Checkbox painted Blue!");
    }
}
