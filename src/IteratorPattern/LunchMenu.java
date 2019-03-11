package IteratorPattern;

import java.util.Iterator;

public class LunchMenu {

    static int MAX_SIZE = 6;
    private MenuItem[] menuItems;
    private int numberOfItems = 0;

    public LunchMenu() {
        menuItems = new MenuItem[MAX_SIZE];
        addItem("Chicken","Chicken Roast with Rice and Daal",false,40);
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
        return new LunchMenuIterator(menuItems);
    }
}
