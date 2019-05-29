package exercício1;

import java.util.Locale;
import java.util.Scanner;

public class Principal4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int numero = sc.nextInt();
		
		System.out.print("Enter the worked hours: " );
		int horas = sc.nextInt();
		
		System.out.print("Enter the hourly wage: ");
		int salario = sc.nextInt();
		
		double sf = horas;
		
		System.out.printf("Número: %d %n", numero);
		System.out.printf("Salário Final: %.2f %n", sf);
		
		sc.close();
	}

}
