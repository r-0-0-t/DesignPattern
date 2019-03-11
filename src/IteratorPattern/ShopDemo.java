package IteratorPattern;

import FactoryPattern.Ship;

public class ShopDemo {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        LunchMenu lunchMenu = new LunchMenu();

        Shop shop = new Shop(lunchMenu,dinnerMenu);

        shop.printMenu();
    }
}
