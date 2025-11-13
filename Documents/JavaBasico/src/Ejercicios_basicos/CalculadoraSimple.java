package Ejercicios_basicos;

import java.util.Scanner;

public class CalculadoraSimple {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int num1, num2;
		System.out.println("Dime un numero: ");
		num1 = escaner.nextInt();
		
		System.out.println("Dime otro numero: ");
		num2 = escaner.nextInt();
		
		System.out.println("Esta es la suma de: " + num1 + "+" + num2 + "=" + (num1+num2));
		System.out.println("Esta es la resta de: " + num1 + "-" + num2 + "=" + (num1-num2));
		System.out.println("Esta es la multiplicacion de: " + num1 + "*" + num2 + "=" + (num1*num2));
		escaner.close();
		
	}

}
