import java.util.Scanner;

public class P1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[]=new int[26];
		
		char result = '?';
		
		String x = sc.next().toLowerCase();
		
		for(int i=0; i<x.length(); i++) {
			arr[x.charAt(i)-'a']++;
		}
		
		int max = -1;
		
		for(int i=0; i<26; i++) {
			if(arr[i]>max) {
				max=arr[i];
				result = (char)(i+65);
			}
			else if (arr[i]==max) {
				result='?';
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
