import java.util.Scanner;


public class Vista {

	public static void main(String[] args) {
		
		float precio = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Press the price of the product without taxes: ");
		precio = sc.nextFloat();
		
		System.out.println("The final price is: " + (precio*0.21 + precio));
		System.out.println("Thank you");
		
		sc.close();
	}

}
