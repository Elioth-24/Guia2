package senati.com.eti;

import java.util.*;

public class Caso03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el n�mero 1: ");
		int n1 = sc.nextInt();
		
		System.out.println("Ingrese el n�mero 2: ");
		int n2 = sc.nextInt();
		
		System.out.println("Ingrese el n�mero 3: ");
		int n3 = sc.nextInt();
		
		String estado = "";
		
		if (n1 == n2 && n1 == n3) 
			estado = "Los n�meros son iguales.";
		else if (n1 > n2 && n1 > n3)
			estado = "El primer n�mero " + n1 + " es mayor.";
		else if (n1 < n2 && n2 > n3)
			estado = "El segundo n�mero " + n2 + " es mayor.";
		else
			estado = "El tercer n�mero " + n3 + " es mayor.";
		
		System.out.println("\nR E S U L T A D O");
		System.out.println("Estado: " + estado);
	}

}
