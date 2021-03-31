package senati.com.eti;

import java.util.Scanner;

public class Caso05 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Precio: ");
		float precio = sc.nextInt();
		
		System.out.println("Cantidad: ");
		int cantidad = sc.nextInt();
		
		float total = cantidad * precio;
		
		float descuento = 0;
		
		if (cantidad > 8)
			descuento = 0.1f * total;
		
		System.out.println("\nR E S U L T A D O");
		System.out.println("Total: " + total);
		System.out.println("Descuento: " + descuento);
		System.out.println("Neto: " + (total - descuento));
		
		
		

	}

}