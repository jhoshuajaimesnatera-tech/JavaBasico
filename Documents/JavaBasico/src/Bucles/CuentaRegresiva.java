package Bucles;

import java.util.Scanner;

public class CuentaRegresiva {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime un numero y te muestro su cuenta regresiva:");
		int num = escaner.nextInt();
		
		escaner.close();
		
		for(int i=num; i>=1; i--) {
			System.out.print(i);
			if (i>1) {
				System.out.print(", ");
			}
		}

	}

}
