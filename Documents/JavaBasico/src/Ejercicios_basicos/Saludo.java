package Ejercicios_basicos;
import java.util.Scanner;
public class Saludo {

	public static void main(String[] args) {
		Scanner escanner = new Scanner(System.in);
		String nombre;
		
		System.out.println("Dime tu nombre: ");
		nombre = escanner.nextLine();
		
		System.out.print("Hola " + nombre);
		
		escanner.close();

	}

}
