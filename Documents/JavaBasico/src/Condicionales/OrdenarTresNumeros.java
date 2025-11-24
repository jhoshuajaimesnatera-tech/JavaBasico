package Condicionales;

import java.util.Scanner;

public class OrdenarTresNumeros {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime Tres numeros y los ordenare de mayor a menor");
		int num1 = escaner.nextInt();
		int num2 = escaner.nextInt();
		int num3 = escaner.nextInt();
		
		escaner.close();
		
		if(num1>num2 && num1>num3) {
			if(num2>=num3) {
				System.out.println("este es el orden " + num1 + "," + num2 + "," + num3);
			}else {
				System.out.println("este es el orden " + num1 + "," + num3 + "," + num2);
			}
		}else if(num2>num1 && num2>num3) {
			if(num1>=num3) {
				System.out.println("este es el orden " + num2 + "," + num1 + "," + num3);
			}else {
				System.out.println("este es el orden " + num2 + "," + num3 + "," + num1);
			}
		}else {
			if(num1>=num2) {
				System.out.println("este es el orden " + num3 + "," + num1 + "," + num2);
			}else {
				System.out.println("este es el orden " + num3 + "," + num2 + "," + num1);
			}
		}
	}

}
