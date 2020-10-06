package Operaciones;

public class Resta {
	
	double numres1 = 0;
	double numres2 = 0;
	double res = 0;
	
	public Resta(double num1, double num2) {
		
		numres1 = num1;
		numres2 = num2;
	}
	
	public double restar (){
		res = numres1 - numres2;
		return res;
	}
}
