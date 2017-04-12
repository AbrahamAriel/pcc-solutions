import java.util.Scanner;

class Main {

    /** Combination info
     * c1 - BCG
     * c2 - BGC
     * c3 - CBG
     * c4 - CGB
     * c5 - GBC
     * c6 - GCB
     */

    static String[] comboC = {"BCG", "BGC", "CBG", "CGB", "GBC", "GCB"};

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int[] a = new int[3];
            int[] b = new int[3];
            int[] c = new int[3];

            for(int i=0; i<3; i++)
                a[i] = sc.nextInt();

            for(int i=0; i<3; i++)
                b[i] = sc.nextInt();

            for(int i=0; i<3; i++)
                c[i] = sc.nextInt();

            int[] comboI = new int[6];

            // c1
            comboI[0] = b[0] + c[0] + a[2] + c[2] + a[1] + b[1];

            // c2
            comboI[1] = b[0] + c[0] + a[1] + c[1] + a[2] + b[2];

            // c3
            comboI[2] = b[2] + c[2] + a[0] + c[0] + a[1] + b[1];

            // c4
            comboI[3] = b[2] + c[2] + a[1] + c[1] + a[0] + b[0];

            // c5
            comboI[4] = b[1] + c[1] + a[0] + c[0] + a[2] + b[2];

            // c6
            comboI[5] = b[1] + c[1] + a[2] + c[2] + a[0] + b[0];

            int lowest = getLowest(comboI);
            getCombo(lowest, comboI);
        }
    }

    static int getLowest(int[] arr) {
        int lowest = 999999999;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < lowest)
                lowest = arr[i];
        }

        return lowest;
    }

    static void getCombo(int a, int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(a == arr[i]) {
                System.out.printf("%s %d\n", comboC[i], a);
                break;
            }
        }
    }
}
