/**
 * Class Tempconverter
 */
 
import java.util.*;

public class Tempconverter {
	public static void main(String[] args) {
 
	//Create ArrayList of F temperatures 
	ArrayList <Double> ftemps = new ArrayList<Double>();
	
	//Create ArrayList of C temperatures
	ArrayList <Double> ctemps = new ArrayList<Double>();
	
	//Add some F temperatures to ftemps
	ftemps.add(100.0);
	ftemps.add(32.0);
	ftemps.add(75.0);
	ftemps.add(46.0);
	
	//Loop through ftemps and convert each temp. to C
	for(double temperature:ftemps){
		double celciusTemp = (temperature -32) *(5.0/9);
		ctemps.add(celciusTemp);
	}
	
	for(double temperature:ctemps){
		System.out.println(temperature);
	}

	}
}
