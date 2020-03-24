/*Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays sera la llargada de
cada string ( string nomCiutat.Length). (0,5 punts)
Ompliu els nous arrays lletra per lletra.(2 punts)
Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). (0,5 punts)*/

package Fase1ciutats;

import java.util.List;
public class Fase4 {

	public static void main(String[] args) {
		
		String nameCity=" ";
		String Scadena=" ";
		
		   String nameCity0 = "Barcelona";
		   String nameCity1 = "Madrid";
		   String nameCity2 = "Valencia";
		   String nameCity3 = "Malaga";
		   String nameCity4 = "Cadis";
		   String nameCity5 = "Santander";
		   
		   String cityName=nameCity0 + "\n" + nameCity1+ "\n" + nameCity2+ "\n" + nameCity3+ "\n" + nameCity4+ "\n" + nameCity5+ "\n";
		   
		   for(int x=cityName.length()- 1; x >= 0; x--) {
		        Scadena+= cityName.charAt(x);
		   }
		   
		   System.out.println(Scadena);
	}
}
		   
	    
	
		   
	

