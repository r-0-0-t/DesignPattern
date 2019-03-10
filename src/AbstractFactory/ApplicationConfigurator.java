package AbstractFactory;

public class ApplicationConfigurator {
    public static void main(String[] args) {
        GUIFactory factory = null;
        String config = "Windows";

        if(config.equals("Windows"))
            factory = new WinFactory();
        else if(config.equals("Mac"))
            factory = new MacFactory();

        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
