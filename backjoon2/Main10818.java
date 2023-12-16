package backjoon2;
import java.util.*;

public class Main10818 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int [] arr = new int[a];
	
	for(int i  = 0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	
//	for(int i1 = 0; i1<arr.length-1; i1++) {
//		
//		for(int i2 = 0; i2 < arr.length-1-i1; i2++) {
//		
//		if(arr[i2] > arr[i2+1]) {
//			int tmp = 0;
//			tmp = arr[i2];
//			arr[i2] = arr[i2+1]; 
//			arr[i2+1] = tmp;	
//		}
//		}
//	}
	Arrays.sort(arr);
System.out.println(arr[0] + " " + arr[arr.length-1]);
}
}

