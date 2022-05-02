import java.io.*;
import java.util.Arrays;

public class P2562 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[]=new int[9];
		int arr2[]=new int[9];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(br.readLine());
			arr2[i]=arr[i];
		}
		Arrays.sort(arr2);
		
		int max=arr2[8];

		for(int i=0; i<arr.length; i++) {
			if(max==arr[i]) {
				System.out.println(max);
				System.out.println(i+1);
			}
		}
		
	}
}
