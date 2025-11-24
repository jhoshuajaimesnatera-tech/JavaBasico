package Cadenas;

import java.util.Scanner;

public class ContarCaracter {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String palabra;
		char caracter;
		int contador=0;
		
		System.out.println("dime una palabra o una frase: ");
		palabra = escaner.nextLine();
		
		System.out.println("Dime un caracter y te dire cuantas veces aparece en la palabra o frase: ");
		caracter = escaner.next().charAt(0);
		
		
		for(int i=0; i<palabra.length(); i ++) {
			if(palabra.charAt(i) == caracter) {
			contador++;
			}
		}
		
		escaner.close();

		System.out.println("Estas son las veces que aparece: " + contador);
	}

}
