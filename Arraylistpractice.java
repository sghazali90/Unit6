/**
 * Class Arraylistpractice
 */

import java.util.*; 

public class Arraylistpractice {
	public static void main(String[] args) {
    
    //Create a new ArrayList made up of integer elements
    ArrayList <Integer> intArray = new ArrayList<Integer>();
    
    //Add 3 elements to intArray
    intArray.add(50);
    intArray.add(-5);
    intArray.add(600);
    
    //for loop to print out each element
    for(int i= 0; i<intArray.size();i++){
    	System.out.println(intArray.get(i));
    }
 
    
	}
}
