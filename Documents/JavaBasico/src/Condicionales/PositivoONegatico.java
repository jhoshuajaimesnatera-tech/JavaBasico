package Condicionales;

import java.util.Scanner;

public class PositivoONegatico {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime un numero y te digo si es positivo o negativo");
		int num = escaner.nextInt();
		
		escaner.close();
		
		if(num >0) {
			System.out.println("El numero " + num + " es positivo");
		}else if(num < 0) {
			System.out.println("El numero " + num + " es negativo");
		}else {
			System.out.println("El numero cero no se considera ni negativo ni positivo");
		}
	}

}
