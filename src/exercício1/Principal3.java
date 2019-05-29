package exercício1;

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int x = a * b;
		int y = c * d;
		
		int z = x - y;
		
		System.out.printf("Diferença: %d", z);
		
		sc.close();

	}

}
