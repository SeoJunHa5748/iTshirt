package backjoon;
import java.util.*;
public class Main8393 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int c = 0; 
	for (int i = 0; i<=a; i++) {
		c += i;
	}
	
	System.out.printf("%d",c);
}
}
