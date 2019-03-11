package IteratorPattern;

import java.util.Iterator;

public class DinnerMenu {
    static int MAX_SIZE = 6;
    private int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_SIZE];
        addItem("Mutton","Mutton and Polao",false,180);
    }

    public void addItem(String name,String description,boolean vegetarian,double price)
    {
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        if (numberOfItems >= MAX_SIZE) {
            System.err.println("Out Of Bound!");
        }
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
