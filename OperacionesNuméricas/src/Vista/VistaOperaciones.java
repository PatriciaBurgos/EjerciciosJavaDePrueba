package Vista;
import java.util.Scanner;

import Operaciones.Suma;
import Operaciones.Resta;
import Operaciones.Division;
import Operaciones.Multiplicacion;
import Operaciones.Modulo;

public class VistaOperaciones {

	public static void main(String[] args) {
		
		double num1 = 0;
		double num2 = 0;
		Scanner scanner = new Scanner(System.in);
		
		//Ask user for numbers
		System.out.println("Introduce two numbers");
		//Receive numbers
		
		System.out.print("Number1: ");
		num1 = scanner.nextDouble();
		System.out.print("Number2: ");
		num2 = scanner.nextDouble();
		
		System.out.println("Perfect");
		
		//Call suma
		Suma suma = new Suma(num1,num2);
		System.out.println(num1 + " + " + num2 + " = " + suma.sumar());
		
		//Call resta
		Resta resta = new Resta(num1,num2);
		System.out.println(num1 + " - " + num2 + " = " + resta.restar());
		
		//Call multiplicacion
		Multiplicacion multip = new Multiplicacion(num1,num2);
		System.out.println(num1 + " x " + num2 + " = " + multip.multiplicar());
		
		//Call division
		if(num2!=0){
			Division division = new Division(num1,num2);
			System.out.println(num1 + " / " + num2 + " = " + division.dividir());
		}else{
			System.out.println("No se pude dividir por 0");
		}
		
		//Call modulo
		if(num2!=0){
			Modulo modulo = new Modulo(num1,num2);
			System.out.println(num1 + " % " + num2 + " = " + modulo.modulo());
		}else{
			System.out.println("No se pude hacer el modulo por 0");
		}
		
		scanner.close();
	}

}
