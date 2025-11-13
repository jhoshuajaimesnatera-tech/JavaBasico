package Ejercicios_basicos;

import java.util.Scanner;

public class SaludoPersonalizado {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String nombre, apellido;
		System.out.println("Dime tu nombre: ");
		nombre = escaner.nextLine();
		System.out.println("Dime tu apellido: ");
		apellido = escaner.nextLine();
		System.out.print("hola "+ nombre + " " + apellido);
		
		escaner.close();

	}

}
