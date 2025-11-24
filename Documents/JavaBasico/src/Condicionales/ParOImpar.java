package Condicionales;

import java.util.Scanner;

public class ParOImpar {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime un numero y te dire si es oar o impar: ");
		int num = escaner.nextInt();
		
		escaner.close();
		
		if(num%2==0) {
			System.out.println("El numero" + num + "es par");
		}else {
			System.out.println("El numero" + num + "es impar");
		}

	}

}
