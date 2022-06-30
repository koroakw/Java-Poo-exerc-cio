package obj;

public class dados {
public String name;
public double GrossSalary;
public double tax;
public double percentage;
double withTax;
public double Netsalary() {
	
	return withTax = GrossSalary -  tax;
	 
}
public double IncreaseSalary() {
   double s = percentage/100;
     s = s*GrossSalary;
  return s +withTax;
	 
	
}
}
