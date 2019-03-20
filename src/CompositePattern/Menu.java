package CompositePattern;

import FactoryPattern.Ship;

import java.util.ArrayList;

public class Menu implements AbstractItem {

    private ArrayList<AbstractItem> menuItems;
    private String menuName;

    public Menu(String menuName) {
        menuItems = new ArrayList<>();
        this.menuName = menuName;
    }

    void add(AbstractItem item) {
        menuItems.add(item);
    }

    @Override
    public void print() {
        System.out.println(Shop.compositeString+" "+menuName);
        Shop.compositeString.append("   ");
        for(AbstractItem item : menuItems) {
            item.print();
        }
        Shop.compositeString.setLength(Shop.compositeString.length()-3);
    }
}
