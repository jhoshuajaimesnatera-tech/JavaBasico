package Bucles;

import java.util.Scanner;

public class SumarHasta {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int num, suma=0;
		do {
			System.out.println("Dime un numero: ");
			num = escaner.nextInt();
			
			suma= suma+num;
			
		}while(num !=0);
		
		System.out.println("Esta es la suma de todos los numeros que ingresaste antes del 0: " + suma);
		
		escaner.close();

	}

}
