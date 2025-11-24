package Ejercicios_basicos;

import java.util.Scanner;

public class AreaRectangulo {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		double base, alto, area;
		System.out.println("Dime la base del rectangulo: ");
		base = escaner.nextDouble();
		
		System.out.println("Dime el alto del rectangulo: ");
		alto = escaner.nextDouble();
		
		area=(base * alto);
		
		System.out.print("Esta es el area del rectangulo: " + area);
		
		escaner.close();

	}

}
