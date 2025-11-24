package Ejercicios_basicos;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime el radio de tu circulo: ");
		double radio = escaner.nextDouble();
		
		double area = Math.PI * Math.pow(radio, 2);
		
		System.out.print("Esta es el area de tu circulo: " + area);
		
		escaner.close();

	}

}
