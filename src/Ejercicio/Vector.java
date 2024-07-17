package Ejercicio;
import java.util.Scanner;
/*
 * Autor: Marcos Antonio Guarachi Mamani
 */
public class Vector {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Tamaño de los vectores
		System.out.print("Ingrese la cantidad de estudiantes: ");
		int n = scanner.nextInt();

		// Crear los vectores A y B
		String[] A = new String[n]; // Vector de nombres de estudiantes
		int[] B = new int[n]; // Vector de notas

		// Llenar los vectores con nombres de estudiantes y notas
		for (int i = 0; i < n; i++) {
			System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
			A[i] = scanner.next();
			System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
			B[i] = scanner.nextInt();
		}

		// Determinar al estudiante con la mayor nota
		int indiceMayorNota = 0;
		int mayorNota = B[0];
		for (int i = 1; i < n; i++) {
			if (B[i] > mayorNota) {
				mayorNota = B[i];
				indiceMayorNota = i;
			}
		}

		// Mostrar al estudiante con la mayor nota
		System.out.println("El estudiante con la mayor nota es:");
		System.out.println("Nombre: " + A[indiceMayorNota]);
		System.out.println("Nota: " + mayorNota);

		scanner.close();
	}
}