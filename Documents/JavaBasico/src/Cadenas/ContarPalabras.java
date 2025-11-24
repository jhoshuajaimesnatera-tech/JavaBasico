package Cadenas;

import java.util.Scanner;

public class ContarPalabras {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String frase;
		int palabras= 0;
		System.out.println("Dime una frase y te dire cuantas palabras tiene: ");
		frase = escaner.nextLine();
		
		for(int i=0; i < frase.length(); i++) {
			if(frase.charAt(i) == ' ') {
				palabras++;
			}
		}
		palabras++;
		
		System.out.println("Esta es la cantidad de palabras en la frase: " + palabras);
		
		escaner.close();

	}

}
