package CompositePattern;

public class Item implements AbstractItem {

    private String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public void print() {
        System.out.println(Shop.compositeString+itemName);
    }
}
