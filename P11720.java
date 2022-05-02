import java.util.Scanner;

public class P11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int sum=0;
		String y = sc.next();
		
		for(int i=0; i<x; i++) {
			sum=sum+y.charAt(i)-48;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
