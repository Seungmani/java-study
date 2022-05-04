import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1018 {
	
	public static boolean arr[][];
	static int min=64;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		arr = new boolean[x][y];
		
		for(int i=0; i<x; i++) {
			String str = br.readLine();
			
			for(int j=0; j<y; j++) {
				if(str.charAt(j) =='W') {
					arr[i][j]=true;
				}
				else {
					arr[i][j]=false;
				}
			}
		}
		
		
		for(int i=0; i<x-7; i++) {
			for(int j=0; j<y-7; j++) {
				MinColor(i,j);
			}
		}
		System.out.println(min);
	}
	
	public static int MinColor(int x, int y) {
	
		int count=0;
		
		boolean color=arr[x][y];
		
		for(int i=x; i<x+8; i++) {
			for(int j=y; j<y+8; j++) {
				if(arr[i][j] != color) {
					count ++;
				}
				color=(!color);
			}
			color=(!color);
		}
		count = Math.min(count, 64 - count);
		min=Math.min(count, min);
		
		return min;
	}
}
