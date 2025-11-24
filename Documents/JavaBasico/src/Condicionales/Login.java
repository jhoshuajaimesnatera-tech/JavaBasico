package Condicionales;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Dime tu nombre de usuario: ");
		String nombre = escaner.nextLine();
		
		System.out.println("Dime la contraseña: ");
		String contraseña = escaner.nextLine();
		
		escaner.close();
		if(nombre.equals("admin") && contraseña.equals("1234")) {
			System.out.println("Acceso concedido");
		}else {
			System.out.println("acceso denegado");
		}
	}

}
