package Operaciones;

public class Suma {

	double sumando1 = 0;
	double sumando2 = 0;
	double res = 0;
	
	public Suma(double num1, double num2) {
		
		sumando1 = num1;
		sumando2 = num2;
	}
	
	public double sumar (){
		res = sumando1 + sumando2;
		return res;
	}
	
}
