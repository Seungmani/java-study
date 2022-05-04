import java.util.Scanner;

public class P2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int x=0;
		
		for(int i=0; i<n; i++) {
			int k=i;
			int sum=0;
			
			while(k != 0) {
				sum=sum+(k%10);
				k=k/10;
			}
			
			if(sum+i==n) {
				x=i;
				break;
			}
		}
		System.out.println(x);
		
		sc.close();
	}
}
