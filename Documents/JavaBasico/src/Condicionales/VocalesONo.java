package Condicionales;

import java.util.Scanner;

public class VocalesONo {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime una Vocal: ");
		char vocal= escaner.nextLine().charAt(0);
		
		if(vocal =='a') {
			System.out.println("Es una vocal");
		}else if (vocal == 'e') {
			System.out.println("Es una vocal");
		}else if (vocal =='i') {
			System.out.println("Es una vocal");
		}else if (vocal =='o') {
			System.out.println("Es una vocal");
		}else if (vocal =='u') {
			System.out.println("Es una vocal");
		}else {
			System.out.println("No es una vocal");
		}
		
		
		escaner.close();

	}

}
