
import java.util.*; 

public class Webstore {

	public static void main(String[] args) {
		
		//Create a Cart2 object
		Cart2 cart = new Cart2();
		
		//Initialize character variable to "y"
		char shouldWeContinue='y';
		
		while (shouldWeContinue=='y'){
			//Ask user to enter item
			System.out.println("Please enter an item: ");
			
			//Save item in a variable calledf itemName
			Scanner input= new Scanner(System.in);
			String itemName = input.nextLine();
			
			//Ask user to enter item price
			System.out.println("Please enter item price: $");
			input= new Scanner(System.in);
			Double itemPrice = input.nextDouble();
			
			//Create an Item object w/ itemName and itemPrice Fields
			Item newItem = new Item(itemName, itemPrice);
			
			if (itemName.equals("")){
				shouldWeContinue='n';
			}
			else{
				cart.addItem(newItem);
			}
			
		}
		System.out.println(cart.things);
		
	}
}
