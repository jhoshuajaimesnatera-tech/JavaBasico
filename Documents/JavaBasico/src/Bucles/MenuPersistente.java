package Bucles;

import java.util.Scanner;

public class MenuPersistente {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int opc;
		do {
			System.out.println("Menu escoge una opcion: ");
			System.out.println("opcion 1 saludo");
			System.out.println("opcion 2 la Hora");
			System.out.println("Dime 3 agradecimiento");
			System.out.println("opcion 4 salir");
			opc =escaner.nextInt();
			
			escaner.nextLine();
			
			String nombre;
			
			switch (opc) {
				case 1:
					System.out.println("Dime tu nombre: ");
					nombre = escaner.nextLine();
					
					System.out.println("hola " + nombre);
				break;
				
				case 2:
					System.out.println("18:45");
					
				break;
				
				case 3:
					System.out.println("Dime tu nombre: ");
					nombre = escaner.nextLine();
					
					System.out.println("Gracias " + nombre);
				break;
				
				case 4:
					System.out.println("Hasta luego ");
					
				break;
				
				default:
					System.out.println("Opcion no valida");
				break;
			}
		
		}while(opc != 4);
	escaner.close();
	}
}