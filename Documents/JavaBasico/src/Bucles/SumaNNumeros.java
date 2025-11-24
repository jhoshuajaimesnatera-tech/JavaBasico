package Bucles;

import java.util.Scanner;

public class SumaNNumeros {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime un numero y te dire la suma de hasta llegar a el:");
		int num = escaner.nextInt();
		// aqui definimos un variable para que guarde el valor en cada pasada del bucle
		int suma= 0;
		
		for(int i=1; i <= num; i++) {
			suma=(suma+i);
			// esto lo hacemos para ver que esta pasando en el bucle
			//System.out.println("Esta es la suma: " + suma); 
		}
		
		System.out.println("Esta es la suma: " + suma);
		
		
		escaner.close();
	}

}
