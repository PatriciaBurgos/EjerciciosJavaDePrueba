package Operaciones;

public class Division {
	
	double divnum1 = 0;
	double divnum2 = 0;
	double res = 0;
	
	public Division(double num1, double num2) {
		
		divnum1 = num1;
		divnum2 = num2;
	}
	
	public double dividir (){
		res = divnum1 / divnum2;
		return res;
	}

}
