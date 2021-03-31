package senati.com.eti;
import java.util.Scanner;
public class Caso11 {

	public static void main(String[] args) {
		Scanner semana = new Scanner(System.in);
		
		System.out.println("Ingrese un número: \n1: Domingo \n2: Lunes \n3: Martes \n4: Miercoles \n5: Jueves \n6: Viernes \n7: Sábado ");
		int dia = semana.nextInt();
		
		switch(dia){
		case 1:
			System.out.println("Es domingo");
			break;
		case 2:
			System.out.println("E Lunes");
			break;
		case 3:
			System.out.println("Es Martes");
			break;
		case 4:
			System.out.println("Es Miercoles");
			break;
		case 5:
			System.out.println("Es Jueves");
			break;
		case 6:
			System.out.println("Es Viernes");
			break;
		case 7:
			System.out.println("Es Sábado");
			break;	
		default:
		
		System.out.println("El día es desconocido");
		}

	}

}
