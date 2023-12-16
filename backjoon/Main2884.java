package backjoon;
import java.util.*;
public class Main2884 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int H = sc.nextInt();
	int M = sc.nextInt();
	
	if(M-45>=0) {
		System.out.printf("%d %d",H,M-45);
	}else if(M-45<0){
		if(H-1>=0){
			int a = (M-45);
			System.out.printf("%d %d",H-1, 60 + a);
		}else {
			int a = (M-45);
			System.out.printf("%d %d",23, 60 + a);
		}
		
	}
	
}
}
