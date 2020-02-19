
public class Store {
	
	//method to print array to the screen
	public static void printArray(String array[]){
		for (int i = 0; i < array.length; i++) {
			 if (i > 0) {
				 System.out.print(", ");
		         }
			 System.out.print(array[i]);
		      }
	}
	
	public static void main(String[] args) {
		
		//Create an object called cart1
		Cart cart1= new Cart(); 
		
		//add "apples" to the array
		cart1.addItem("apples");
		
		printArray(cart1.getItems());
		
	}

}
