package IteratorPattern;

import java.util.Iterator;

public class Shop {
    private LunchMenu lunchMenu;
    private DinnerMenu dinnerMenu;

    public Shop(LunchMenu lunchMenu, DinnerMenu dinnerMenu) {
        this.lunchMenu = lunchMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator lunchIterator = lunchMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        System.out.println("Lunch\n----------\n");
        printMenu(lunchIterator);
        System.out.println("\nDinner\n--------\n");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem) iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print(item.getDescription() + " -- ");
            System.out.println(item.getPrice());
        }
    }
}
