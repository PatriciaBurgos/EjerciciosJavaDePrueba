import java.util.Scanner;


public class Vista {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press two number, I'm going to say you what is the biggest");
		System.out.print("Number 1: ");
		num1 = sc.nextInt();
		System.out.print("Number 2: ");
		num2 = sc.nextInt();
		
		if(num1 > num2){
			System.out.println(num1 + " > " + num2);
		}else if(num1 < num2){
			System.out.println(num1 + " < " + num2);
		}else{
			System.out.println(num1 + " = " + num2);
		}
		
		sc.close();
	}

}
