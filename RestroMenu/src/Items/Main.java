package Items;

public class Main {
    public static void main(String[] args) {
        
        Menu menu = new Menu();

        
        MenuItem item1 = new MenuItem(1, "Thakali Khana", "buckwheat, barley, millet and dal, as well as rice, maize and dal ", 600, "Main Courses");
        MenuItem item2 = new MenuItem(2, "chicken Momo", "dumpling made of all-purpose flour and filled with  chicken keema ", 250, "Snacks");
        MenuItem item3 = new MenuItem(3, "Ice-cream", "a rich, sweet, creamy frozen food made from variously flavored cream and milk products", 120, "Desserts");

        
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);

        
        System.out.println("All Menu Items:");
        menu.viewAllItems();

        
        MenuItem updatedItem = new MenuItem(1, "Cheeseburger", "Juicy  patty with  cheese", 250, "Snacks");
        if (menu.updateItem(1, updatedItem)) {
            System.out.println("Menu item updated successfully!");
        } else {
            System.out.println("Menu item not found.");
        }

        
        System.out.println("Updated Menu Items:");
        menu.viewAllItems();

        
        if (menu.deleteItem(2)) {
            System.out.println("Menu item deleted successfully!");
        } else {
            System.out.println("Menu item not found.");
        }

        
        System.out.println("Remaining Menu Items:");
        menu.viewAllItems();
    }
}

