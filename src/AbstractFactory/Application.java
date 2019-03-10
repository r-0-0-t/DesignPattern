package AbstractFactory;

public class Application {
    private Button button;
    private GUIFactory factory;

    Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }
}
