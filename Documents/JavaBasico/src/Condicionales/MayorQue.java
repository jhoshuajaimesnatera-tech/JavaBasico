package Condicionales;

import java.util.Scanner;

public class MayorQue {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime dos numeros y te dire cual es mayor: ");
		int num1 = escaner.nextInt();
		int num2 = escaner.nextInt();
		
		escaner.close();
		
		if(num1 >= num2) {
			System.out.print("El primero es mayor "+ num1);
		}else {
			System.out.print("El segundo es mayor " + num2);
		}

	}

}
