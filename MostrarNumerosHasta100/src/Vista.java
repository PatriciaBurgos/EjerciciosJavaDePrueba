
public class Vista {

	public static void main(String[] args) {
		
		System.out.println("I'll show you numbers up to 100");
		System.out.println("BUCLE WHILE");
		
		int i = 0;
		while(i<=100){
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("BUCLE FOR");
		
		for(int j = 0; j<=100; j++){
			System.out.print(j + " ");
		}
		
		System.out.println();
		System.out.println("Now, I'll show you the numbers divisibles between 2 and 3 up to 100");
		
		System.out.println("Divisibles 2");
		for(int k = 0; k<=100; k++){
			if(k%2 == 0){
				System.out.print(k + " ");
			}
		}
		
		System.out.println();
		System.out.println("Divisibles 3");
		for(int l = 0; l<=100; l++){
			if(l%3 == 0){
				System.out.print(l + " ");
			}
		}
		
		System.out.println();
		System.out.println("Divisibles 2 and 3");
		for(int m = 0; m<=100; m++){
			if(m%3 == 0 && m%2 == 0){
				System.out.print(m + " ");
			}
		}
	}

}
