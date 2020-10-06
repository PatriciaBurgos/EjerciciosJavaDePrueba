import java.util.Scanner;


public class Vista {

	public static void main(String[] args) {
		
		double radio = 0, area = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Press the radius of a circle: ");
		radio = sc.nextDouble();
				
		area = Math.PI * Math.pow(radio, 2);
		System.out.println("Area = " + (double)Math.round(area * 100d) / 100d);
		
		sc.close();
	}

}
