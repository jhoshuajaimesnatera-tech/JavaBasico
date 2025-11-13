package Ejercicios_basicos;

import java.util.Scanner;

public class CocienteYResto {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int divisor,dividendo;
		System.out.println("Dime el numero dividendo: ");
		dividendo = escaner.nextInt();
		
		System.out.println("Dime el numero divisor: ");
		divisor = escaner.nextInt();
		
		System.out.println("Esta es la division de: " + dividendo + "/" + divisor + "=" + ( dividendo / divisor));
		System.out.println("Esta es el resto de: " + dividendo + "%" + divisor + "=" + ( dividendo % divisor));
		
		escaner.close();
	}

}
