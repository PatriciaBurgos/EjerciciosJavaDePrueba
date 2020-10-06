package Operaciones;

public class Multiplicacion {
	
	double num_mul1 = 0;
	double num_mul2 = 0;
	double res = 0;
	
	public Multiplicacion(double num1, double num2) {
		
		num_mul1 = num1;
		num_mul2 = num2;
	}
	
	public double multiplicar (){
		res = num_mul1 * num_mul2;
		return res;
	}
}
