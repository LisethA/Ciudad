package Fase1ciutats;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Fase2 {

	public static void main(String[] args) {
		

List name = new LinkedList<>();
		
		name.add("Barcelona");
		name.add("Madrid");
		name.add("Valencia");
		name.add("Malaga");
		name.add("Cadis");
		name.add("Santander");
		
     
	String [] arrayCity= {"Barcelona", "Madrid", "Valencia", "Malaga", "Cadis", "Santander"};
	 Collections.sort(name);
	 
	for (String i : arrayCity) {
	 System.out.println(i);
	}
	}
}

	
	  
	/*	for (String name: arrayCity);
	System.out.println(name);
		}
	}*/
	



