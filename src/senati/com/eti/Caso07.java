package senati.com.eti;
import java.util.Scanner;
public class Caso07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sueldo: ");
		float sueldo = sc.nextInt();
		
		float impuesto = 0;
		
		if(sueldo <= 1500)
			impuesto = 0.03f * sueldo;
		else if (sueldo > 1500 && sueldo < 3000)
			impuesto = 0.08f * sueldo;
		else if (sueldo > 3000)
			impuesto = 0.12f * sueldo;
		
		System.out.println("R E S U L T A D O S");
		System.out.println("Impuesto: " + impuesto);

	}

}
