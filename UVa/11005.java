import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1; i<=T; i++) {
            int[] cost = new int[36];

            for(int j=0; j<cost.length; j++) {
                cost[j] = sc.nextInt();
            }

            int X = sc.nextInt();
            System.out.printf("Case %d:\n", i);
            for(int j=0; j<X; j++) {
                int[] converted = new int[37];
                Arrays.fill(converted, 0);

                int n = sc.nextInt();

                for(int k=2; k<=36; k++) {
                    int b = n;
                    while(b > 0) {
                        converted[k] += cost[b%k];
                        b /= k;
                    }
                }

                int lowest = getLowest(converted);
                System.out.printf("Cheapest base(s) for number %d:", n);
                getSame(lowest, converted);
                System.out.println();
            }
            if(i != T)
                System.out.println();
        }
    }

    static int getLowest(int[] arr) {
        int lowest = 999999999;

        for(int i=2; i<=36; i++) {
            if(arr[i] < lowest)
                lowest = arr[i];
        }

        return lowest;
    }

    static void getSame(int n, int[] arr) {
        for(int i=2; i<=36; i++) {
            if(arr[i] == n)
                System.out.printf(" %d", i);
        }
    }
}
