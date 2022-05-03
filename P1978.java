import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class P1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			int x = Integer.parseInt(st.nextToken());
			int y=0;
			
			if(x==1) continue;
			
			for(int j=2; j<Math.sqrt(x); j++) {
				if(x%j==0) {
					y=1;
				}
			}
			
			if(y==0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
