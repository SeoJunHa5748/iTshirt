package backjoon;
import java.util.Scanner;
public class Main2525 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	
	if(B+C<60) {
		System.out.printf("%d %d",A,B+C);
	}
	
	else if(B+C>=60){
		
		for(int i = ((int)(B+C)/60); i>0; i--) {
				A++;
				if(A==24) {
					A = 0;
				}
				}
	System.out.printf("%d %d",A,(B+C) - ((((int)(B+C)/60)) * 60) );	
	}
	
}

}

