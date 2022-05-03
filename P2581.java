import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int sum=0;
		int min=y;
		
		for(int i=x; i<=y; i++) {
			int k=0;
			
			if(i==1) {
				k=1;
			}
			
			for(int j=2; j<Math.sqrt(i); j++) {
				if(i%j==0) {
					k=1;
					break;
				}
			}
			
			if(k==0) {
				sum=sum+i;
				if(min>i) {
					min=i;
				}
			}
			
		}
		if(sum==0) {
			System.out.println("-1");
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
}
