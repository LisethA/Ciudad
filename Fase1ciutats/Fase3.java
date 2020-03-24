/*Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length). (0,5 punts)
Ompliu els nous arrays lletra per lletra
Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB).*/

package Fase1ciutats;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class Fase3 {

	public static void main(String[] args) {
		List namecity = new LinkedList<>();
		
           String namecity0 = "Barcelona";
		   String namecity1 = "Madrid";
		   String namecity2 = "Valencia";
		   String namecity3 = "Malaga";
		   String namecity4 = "Cadis";
		   String namecity5 = "Santander";
		   
	

	String [] arrayCity={namecity0,namecity1,namecity2,namecity3,namecity4,namecity5};
	
		Arrays.sort(arrayCity); // metodo que ordena el array 
		
		for(int i=0; i<arrayCity.length; i++)
		System.out.println(arrayCity[i]);
		
		
		
		String[] arrayModifiedcity= new String [6]; //nueva array creada
		
		for(int i=0; i<arrayCity.length; i++) 

		  arrayModifiedcity[0]= arrayCity[0].replace('a','4'); //hacemos el reemplazo 
		  arrayModifiedcity[1]= arrayCity[1].replace('a','4');
		  arrayModifiedcity[2]= arrayCity[2].replace('a','4');
		  arrayModifiedcity[3]= arrayCity[3].replace('a','4');
		  arrayModifiedcity[4]= arrayCity[4].replace('a','4');
		  arrayModifiedcity[5]= arrayCity[5].replace('a','4');
		  
		  for(int i=0; i<arrayCity.length; i++);
			  
		  System.out.println(arrayModifiedcity[0]); //imprimimos el reemplazo de la A por el 4
		  System.out.println(arrayModifiedcity[1]);
		  System.out.println(arrayModifiedcity[2]);
		  System.out.println(arrayModifiedcity[3]);
		  System.out.println(arrayModifiedcity[4]);
		  System.out.println(arrayModifiedcity[5]);
		  
}	
}

	
