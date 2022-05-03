import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int x = Integer.parseInt(br.readLine());
			int count=0;
			
			for(int i=x+1; i<=2*x; i++) {
				int k=0;
				if(i==1) {
					k=1;
				}
				for(int j=2; j<=Math.sqrt(i); j++) {
					if(i%j==0) {
						k=1;
						break;
					}
				}
				if(k==0) {
					//System.out.println(i);
					count++;
				}
			}
			
			if(x==0) {
				break;
			}
			System.out.println(count);
		}
	}
}
