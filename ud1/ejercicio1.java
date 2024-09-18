package com;

import java.util.Scanner;

public class Saludo {
	public static void main(String[] args) {
		// Java necesita usar la clase Scanner para leer por consola
		Scanner scanner = new Scanner(System.in);

		/** Inicializo las variables */
		String nombre;
		String apellido;
		String saludo;
		
		/** Obtengo los datos */
		System.out.println("Dime tu nombre");
		nombre = scanner.nextLine();
		System.out.println("Dime tu apellido");
		apellido = scanner.nextLine();
		
		/** Realizo operación */
		saludo = "Hola " + nombre + " " + apellido;

		/** Muestro los resultados */
		System.out.println(saludo);
	}
}
