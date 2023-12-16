package backjoon;

import java.util.Scanner;

public class Main2439_non {
public static void main(String[] args) {



	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	
	for(int i = 1; i<=a; i++) {	
		
		for(int j = 1; j<=a-i; j++) {
			System.out.print(" ");
		}
		for(int j1 =1; j1<=i; j1++){
		System.out.print('*');
		if(j1 == i) {
			System.out.println();
		}
		}
	}
	
	
	
}
}
