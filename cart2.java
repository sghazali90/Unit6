import java.util.*;

public class Cart2 {
	
	//Create a new ArrayList called things made up of Item objects 
	public ArrayList<Item> things = new ArrayList<Item>();
	
	//Method to add items
	public void addItem(Item thing){
		things.add(thing);
	}
	
	//Method to remove items
	public void removeItem(Item thing){
		things.remove(thing);
	}

}
