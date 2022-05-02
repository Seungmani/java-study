

import java.util.Scanner;

public class P2884 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		int H = x.nextInt();
		int M = x.nextInt();
		
		if((M-45)<0) {
			H--;
			M=M+15;
			if(H<0) {
				H=23;
			}
			System.out.println(H+" "+M);
		}
		System.out.println(H+" "+(M-45));
		x.close();
	}
}
