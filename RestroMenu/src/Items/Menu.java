package Items;

import java.util.ArrayList;
import java.util.List;


public class Menu {
    private List<MenuItem> menuItems;

    public Menu() {
        menuItems = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
    }

    public void viewAllItems() {
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
    }

    public boolean updateItem(int itemID, MenuItem updatedItem) {
        for (int i = 0; i < menuItems.size(); i++) {
            if (menuItems.get(i).getItemID() == itemID) {
                menuItems.set(i, updatedItem);
                return true;
            }
        }
        return false;
    }

    public boolean deleteItem(int itemID) {
        for (int i = 0; i < menuItems.size(); i++) {
            if (menuItems.get(i).getItemID() == itemID) {
                menuItems.remove(i);
                return true;
            }
        }
        return false;
    }
}
