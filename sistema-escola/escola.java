package application;

import java.util.Locale;
import java.util.Scanner;

import obj.aluno;

public class escola {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		aluno aluno = new aluno();
		Scanner sc = new Scanner (System.in);
		System.out.print("Nome: ");
		aluno.name = sc.next();
		System.out.print("Nota 1: ");
		aluno.n1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		aluno.n2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		aluno.n3 = sc.nextDouble();
		
		double media = aluno.nota();
		
		if (media<60) {
			double mediaf = 60-media;
			System.out.printf("FINAL GRADE = %.2f%n", media);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", mediaf);
		}else {
			System.out.printf("FINAL GRADE = %.2f%n", media);
			System.out.println("PASS");
		}
		
		
		
		
		sc.close();
		}

}
