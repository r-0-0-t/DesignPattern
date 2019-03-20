package CompositePattern;

public class Shop {
    public static StringBuffer compositeString = new StringBuffer();
    public static void main(String[] args) {
        Menu dinnerMenu = new Menu("DinnerMenu");
        Menu dinnerDessert = new Menu("DinnerDessert");
        Item item1 = new Item("FishCurry");
        Item item2 = new Item("Rice");
        Item item3 = new Item("IceCream");
        Item item4 = new Item("Pasta");
        Item item5 = new Item("Macaroon");

        dinnerMenu.add(item1);
        dinnerDessert.add(item5);
        dinnerDessert.add(item3);
        dinnerMenu.add(dinnerDessert);
        dinnerMenu.add(item2);
        dinnerMenu.add(item4);

        dinnerMenu.print();
    }
}
