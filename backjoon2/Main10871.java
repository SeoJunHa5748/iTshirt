package backjoon2;

import java.util.Scanner;

public class Main10871 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int [] arr = new int[a];
	
	for(int i  = 0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	for(int i : arr) {
		if(i<b) {
			System.out.print(i + " ");
		}
	}

}

}
