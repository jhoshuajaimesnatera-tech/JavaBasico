package Cadenas;

import java.util.Scanner;

public class PalabraVertical {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime una palabra y te la mostrare en vertical");
		String palabra = escaner.nextLine();
	
		for(int i=0; i < palabra.length(); i++) {
			System.out.println(palabra.charAt(i));
		}
		
		escaner.close();
		
	}

}
