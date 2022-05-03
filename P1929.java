import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1929 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		boolean arr[]=new boolean[y+1];
		arr[0]=true;
		arr[1]=true;
		
		for(int i=2; i<=Math.sqrt(arr.length); i++) {
			if(arr[i]==true) {
				continue;
			}
			for(int j=i*i; j<arr.length; j=j+i) {
				arr[j]=true;
			}
		}
		
		for(int i=x; i<=y; i++) {
			if(arr[i]==false) {
				System.out.println(i);
			}
		}
// 아래는 에라토스테네스 체 사용
//		boolean P[] = new boolean[246913];
//		
//		P[0]=P[1]=true;
//		for(int i =2; i<=Math.sqrt(P.length); i++) {
//			if(P[i]==true) continue;
//			for(int j= i*i; j<P.length; j=j+i) {
//				P[j]=true;
//			}
//		}
//		
//		while(true) {
//			int x = Integer.parseInt(br.readLine());
//			if(x==0) break;
//			
//			int count =0;
//			for(int i= x+1; i<=2*x; i++) {
//				if(P[i] == false) {
//					count++;
//				}
//			}
//			System.out.println(count);
//		}
	}
}