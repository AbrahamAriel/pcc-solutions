import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(a != 0 && b !=0) {
			int count = 0;
			for(int i=0; i*i<=b; i++) {
				if(i*i >= a) {
					count++;
				}
			}
			
			System.out.println(count);
			a = sc.nextInt();
			b = sc.nextInt();
		}
		
	}
}
