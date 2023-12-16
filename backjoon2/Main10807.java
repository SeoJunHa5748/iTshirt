package backjoon2;

import java.util.Scanner;

public class Main10807 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int [] arr = new int[a];
	
	for(int i  = 0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	int b = sc.nextInt();
	int c = 0;
	for(int u : arr) {
		if(u == b) {
			c++;
		}
	}
	System.out.println(c);
}
}
