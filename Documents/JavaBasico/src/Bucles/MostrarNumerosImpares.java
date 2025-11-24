package Bucles;

import java.util.Scanner;

public class MostrarNumerosImpares {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime un numero y te mostrare los impares hasta llegar a el:");
		int num = escaner.nextInt();
		
		escaner.close();
		
		for(int i=0; i<=num; i++) {
			if(i % 2 !=0) {
				System.out.println("estos son los numeros" + i);
			}
		}

	}

}
