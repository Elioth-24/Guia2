package senati.com.eti;
import java.util.Scanner;
public class Caso08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nota......: ");
		int nota = sc.nextInt();
		String mensaje = "";
		
		if (nota >= 0 && nota <=7)
			mensaje = "Sin palabras";
		else if (nota >=8 && nota <=10)
			mensaje = "Malo";
		else if (nota >=11 && nota<=14)
			mensaje = "Regular";
		else if (nota >=15 && nota<=17)
			mensaje = "Notable";
		else if (nota >= 18 && nota<=20)
			mensaje = "Excelente";
		else
			mensaje = "Valor ingresado no v�lido";
		System.out.println("Estado: "+ mensaje);

	}

}
