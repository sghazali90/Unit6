public class Item {
	//Fields
	private String name;
	private double price;
	
	//Constructor
	public Item(String n, double p) {
	name = n;
	price = p;
	}
	
	//toString method 
	public String toString(){
		return "Name: " + this.name + "\nPrice: $ " + this.price;
	}
}
