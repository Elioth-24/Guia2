package senati.com.eti;
import java.util.Scanner;
public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Empleado: " );
		String nombre = sc.nextLine();
		
		System.out.println("Nivel [1-4]: " );
		int nivel = sc.nextInt();
		
		System.out.println("Sueldo: " );
		float sueldo = sc.nextFloat();
		
		float incremento = 0;
		
		switch(nivel) {
		
		case 1:
			incremento = 0.045f;
			break;
		case 2:
			incremento =0.06f;
			break;
		case 3:
			incremento = 0.085f;
			break;
		case 4:
			incremento =  0.11f;
			break;
		}
		
		System.out.println("R E S U L T A D O S");
		System.out.println("Empleado: " + nombre);
		System.out.println("Nivel: " + nivel);
		System.out.println("Sueldo: " + sueldo);
		System.out.println("Incremento: " + incremento*100 + " %");
		System.out.println("Nuevo sueldo: " +  sueldo * (1 + incremento));

	}

}
