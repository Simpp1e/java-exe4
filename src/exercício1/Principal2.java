package exercício1;

import java.util.Locale;
import java.util.Scanner;


public class Principal2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double raio = sc.nextDouble();
		double area =  3.14159 * (raio * raio);
		
		System.out.printf("Area = %.4f %n", area);
		
		
		sc.close();
		
	}

}
