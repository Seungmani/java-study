import java.io.*;
import java.util.StringTokenizer;

public class P4344 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[];
		
		for(int i = 0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			//�л���
			int student = Integer.parseInt(st.nextToken());
			arr=new int[student];
			
			//����
			double sum=0;
			for(int j=0; j<student; j++) {
				arr[j]=Integer.parseInt(st.nextToken());
				sum=sum+arr[j];
			}
			
			//���
			double avg = sum/student;
			double count=0;
			
			for(int j=0; j<student; j++) {
				if(arr[j]>avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/student)*100);
		}
	}
}
