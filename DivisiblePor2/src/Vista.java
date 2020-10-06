import java.util.Scanner;


public class Vista {

	public static void main(String[] args) {
		
		int num1 = 0, res = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press a number, I'll tell you if it is divisible by 2");
		num1 = sc.nextInt();
		
		res = num1 % 2;
		
		if(res == 0){
			System.out.println("Yees! " + num1 + " is divisible by 2");
		} else {
			System.out.println("Ohh no, " + num1 + " is not divisible by 2");
		}
		
		sc.close();
	}

}
