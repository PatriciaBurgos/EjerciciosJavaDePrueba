import java.util.Scanner;


public class Vista {

	public static void main(String[] args) {
		
		int sum_ventas = 0, num_ventas = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Number of sales: ");
		num_ventas = sc.nextInt();
		
		for(int i = 0; i<num_ventas; i++){
			System.out.print("Sale " + i + ": ");
			sum_ventas += sc.nextInt();
		}
		
		System.out.println("Total: " + sum_ventas);
		
		

	}

}
