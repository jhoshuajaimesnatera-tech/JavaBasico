package Cadenas;

import java.util.Scanner;

public class PalabraLarga {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String palabra1, palabra2;
		System.out.println("Dime una palabra y te dire si tiene mas de 8 caracteres: ");
		palabra1 = escaner.nextLine();
		
		System.out.println("Dime otra palabra y te dire si tiene mas de 8 caracteres: ");
		palabra2 = escaner.nextLine();

		escaner.close();
		
		int longitud1 = palabra1.length();
		int longitud2 = palabra2.length();
		
		if(longitud1 > 8 || longitud2 > 8) {
			System.out.println("Almenos una de las palabras tiene mas de 8 caracteres");
		}else {
			System.out.println("Ninguna de las palabras tiene mas de 8 caracteres");

		}
	
	}

}
