
public class Cart {

	//Declare & Initialize Field(an empty array of Strings)
	private String items[]= new String[0]; 
	
	//Method to add items 
	public void addItem(String item){
		//Create a new array that is 1 element longer than items array
		String newItems[]= new String[items.length + 1]; 
		
		//for loop to copy elements in items into newItems
		for (int i = 0; i< items.length; i++){
			newItems[i]= items[i];
		}
		
		//add "item" into the last spot in newItems
		newItems[items.length]= item; 
		
		//Assign newItems as the updated items array/Field
		items = newItems; 
	}
	
	//method to print array to the screen
	public static void printArray(String array[]){
		for (int i = 0; i < array.length; i++) {
			 if (i > 0) {
				 System.out.print(", ");
		         }
			 System.out.print(array[i]);
		      }
	}
	
}
