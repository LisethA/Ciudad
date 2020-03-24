/*Crea sis variables tipu string buides. (0,5 punts)
Demana per consola que s’introdueixin els noms. (0,5 punts)
Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per
teclat. (0,5 punts)
Mostra per consola el nom de les 6 ciutats. (0,5 punts)*/


package Fase1ciutats;
import java.util.Scanner;
public class Fase1 {

	
	public static void main(String[] args) {
		
		String city1 = "";
		String city2 = "";
		String city3 = "";
		String city4 = "";
		String city5 = "";
		String city6 = "";

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la ciudad");
		city1= sc.nextLine();
		System.out.println(city1);
	
	
       Scanner sc1 = new Scanner(System.in);
       System.out.println("Introduzca la ciudad");
       city2= sc1.nextLine();
       System.out.println(city2);
	
       
       Scanner sc2 = new Scanner(System.in);
       System.out.println("Introduzca la ciudad");
       city3= sc2.nextLine();
       System.out.println(city3);

      
       Scanner sc3 = new Scanner(System.in);
       System.out.println("Introduzca la ciudad");
       city4= sc3.nextLine();
       System.out.println(city4);
       
       
       Scanner sc4 = new Scanner(System.in);
       System.out.println("Introduzca la ciudad");
       city5= sc4.nextLine();
       System.out.println(city5);
       
       
       Scanner sc5 = new Scanner(System.in);
       System.out.println("Introduzca la ciudad");
       city6= sc5.nextLine();
       System.out.println(city6);
	}
}