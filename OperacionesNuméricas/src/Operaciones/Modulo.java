package Operaciones;

public class Modulo {

	double num_mod1 = 0;
	double num_mod2 = 0;
	double res = 0;
	
	public Modulo(double num1, double num2) {
		
		num_mod1 = num1;
		num_mod2 = num2;
	}
	
	public double modulo (){
		res = num_mod1 % num_mod2;
		return res;
	}
}
