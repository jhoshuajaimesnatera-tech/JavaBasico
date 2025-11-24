package Bucles;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime un numero y te digo su factorial: ");
		int num = escaner.nextInt();
		
		escaner.close();
		
		long factorial=1;
	
		for(int i=1; i<=num; i++) {
			factorial=factorial*i;
		}
		System.out.println("Este es el factorial de: " + num + "=" + factorial);
		
	}

}
