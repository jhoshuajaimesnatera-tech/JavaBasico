package Condicionales;

import java.util.Scanner;

public class DivisionSegura {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime el numero que quieres dividir: ");
		int dividendo = escaner.nextInt();
		
		System.out.println(" dime el numero por el que quieres dividir: ");
		int divisor = escaner.nextInt();
		
		escaner.close();
		
		if(divisor>0) {
			System.out.println("la Division de" + dividendo + "/" + divisor + "=" + (dividendo/divisor));
		}else {
			System.out.println("No se puede dividir por 0");
		}

	}

}
