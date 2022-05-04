import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		boolean arr[]=new boolean[10001];
		arr[0]=arr[1]=true;
		
		for(int i=2; i<Math.sqrt(arr.length); i++) {
			if(arr[i]==true) {
				continue;
			}
			for(int j=i*i; j<arr.length; j=j+i) {
				arr[j]=true;
			}
		}
		
		
		for(int i=0; i<N; i++) {
			int x = Integer.parseInt(br.readLine());
			
			
			int y=x/2;
			int z=x/2;
			
			while(true) {
				if((arr[y]==false && arr[z]==false)) {
					System.out.println(y+" "+z);
					break;
				}
				y--;
				z++;
			}
			
		}
		
	}
}
