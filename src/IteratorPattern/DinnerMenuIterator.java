package IteratorPattern;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {

    private MenuItem[] menuItems;
    private int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = menuItems[position];
        position += 1;
        return item;
    }
}
