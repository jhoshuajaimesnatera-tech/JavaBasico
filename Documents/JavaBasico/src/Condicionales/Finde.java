package Condicionales;

import java.util.Scanner;

public class Finde {

	public static void main(String[] args) {
	Scanner escaner = new Scanner(System.in);
	System.out.println("Dime un numero del 1 al 7 y te dire si es laboral o es fin de semana");
	int dia = escaner.nextInt();
	
	escaner.close();
	
	if(dia == 1) {
		System.out.println("Es laboral y es Lunes");
	}else if (dia == 2) {
		System.out.println("Es laboral y es Martes");
	}else if (dia == 3) {
		System.out.println("Es laboral y es Miercoles");
	}else if (dia == 4) {
		System.out.println("Es laboral y es Jueves");
	}else if (dia == 5) {
		System.out.println("Es laboral y es Viernes");
	}else if (dia == 6) {
			System.out.println("Es fin de semana y es Sabado");
	}else if (dia == 7) {
		System.out.println("Es fin de semana y es Domingo");
	}else {
		System.out.println("No es un dia de semana");
	}
	}

}
