import java.util.Scanner;

public class P1065 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println(as(x.nextInt()));
		x.close();
	}
	
	public static int as(int x) {
		int count=0;
		
		if(x<=99) {
			count = x;
		}
		else {
			count=99;
			for(int i=100; i<x; i++) {
				
				int h = i/100;
				int t = (i/10)%10;
				int o = i%10;
				
				if((h-t)==(t-o)) count=count+1;
			}
		}
		
		return count;
	}
}
