import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class P1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count =N;
	
		
		for(int i=0; i<N; i++) {
			boolean arr[]=new boolean[26];
			String str = br.readLine();
			
			for(int j=0; j<str.length(); j++) {
				int x = str.charAt(j)-'a';
				
				
				if(arr[x]==false) {
					arr[x]=true;
				}
				else if(arr[x]==true) {
					if(str.charAt(j)!=str.charAt(j-1)) {
						count--;
						break;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}
