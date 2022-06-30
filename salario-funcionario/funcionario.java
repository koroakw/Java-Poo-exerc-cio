package application;

import java.util.Locale;
import java.util.Scanner;
import obj.dados;

public class funcionario {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	dados dado = new dados();
	Scanner sc = new Scanner (System.in);
	System.out.print("Name: ");
	dado.name = sc.nextLine();
	System.out.print("Gross salary: ");
	dado.GrossSalary = sc.nextDouble();
	System.out.print("Tax: ");
	dado.tax = sc.nextDouble();
	
	System.out.printf("Employe: %s, $ %.2f%n ", dado.name, dado.Netsalary());
	System.out.print("Which percentage do increase salary? ");
	dado.percentage = sc.nextDouble();
	System.out.printf("Updated data: %s, $ %.2f%n ", dado.name, dado.IncreaseSalary());
	sc.close();
	}

}
