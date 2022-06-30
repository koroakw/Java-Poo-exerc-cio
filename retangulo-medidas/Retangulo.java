package application;
import java.util.Locale;
import java.util.Scanner;
import obj.medid;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		medid retangulo;
		retangulo = new medid();
		System.out.print("Digite a altura do retângulo: ");
		retangulo.a = sc.nextDouble();
		System.out.print("Digite a base do retângulo: ");
		retangulo.b = sc.nextDouble();
		double area = retangulo.area(); 
		double peri = retangulo.peri();
		double diag = retangulo.diagonal();
		System.out.println();
		
		System.out.printf("A área é igual a: %.2f%n", area);
		System.out.println();
		System.out.printf("O perímetro é de: %.2f%n", peri);
		System.out.println();
		System.out.printf("A diagonal é de: %.2f%n", diag);
			
		
		
		sc.close();

	}

}
