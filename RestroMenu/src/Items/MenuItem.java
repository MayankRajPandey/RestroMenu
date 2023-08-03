package Items;

public class MenuItem {
	
	private int itemID;
	private String name;
	private String description;
	private double price;
	private String category;
	
	public MenuItem(int itemID, String name, String description,double price, String category) {
		this.itemID = itemID;
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

}
