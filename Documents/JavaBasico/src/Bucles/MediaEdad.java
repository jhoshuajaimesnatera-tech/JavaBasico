package Bucles;

import java.util.Scanner;

public class MediaEdad {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int edad, personas=0, suma=0;
		
		do {
			System.out.println("Dime una edad: ");
			edad = escaner.nextInt();
			if(edad>0) {
				suma= suma+edad;
				personas++;
			}
			
		}while(edad>0);
	
		
		System.out.println("esta es la media en las edades: " + (suma/personas));
		
		escaner.close();

	}

}
