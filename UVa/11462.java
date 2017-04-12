import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		while(a != 0) {
			String[] ch = br.readLine().split(" ");
			int[] n = new int[a];
			for(int i=0; i<a; i++) {
				n[i] = Integer.parseInt(ch[i]);
			}
			Arrays.sort(n);
			System.out.print(n[0]);
			for(int i=1; i<a; i++) {
				System.out.print(" " + n[i]);
			}
			System.out.println();
			
			a = Integer.parseInt(br.readLine());
		}
	}
}
