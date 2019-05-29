package exercício1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int resultado = valor1 + valor2;
		
		System.out.printf("%d + %d = %d", valor1, valor2, resultado);
		
		sc.close();

	}

}
