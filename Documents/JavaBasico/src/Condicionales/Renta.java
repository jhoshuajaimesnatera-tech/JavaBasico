package Condicionales;

import java.util.Scanner;

public class Renta {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime tu edad: ");
		int edad = escaner.nextInt();
		
		escaner.nextLine();
		
		System.out.println("Dime cuanto es tu ingreso mensual: ");
		double salario = escaner.nextDouble();
		
		if(edad>= 18 && salario>1000) {
			System.out.println("Tienes que tributar");
		}else {
			System.out.println("No tienes que tributar");
		}
		
		escaner.close();
	}

}
