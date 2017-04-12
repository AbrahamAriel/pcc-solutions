import java.util.Arrays;
import java.util.Scanner;

class Main {

    static int size;

    public static char[][] rotate90(char[][] arr) {
        char[][] m = new char[size][size];

        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                m[i][j] = arr[size-1-j][i];
            }
        }

        return m;
    }

    public static char[][]  rotate180(char[][] arr) {
        char[][] m = new char[size][size];

        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                m[i][j] = arr[size-1-i][size-1-j];
            }
        }

        return m;
    }

    public static char[][]  rotate270(char[][] arr) {
        char[][] m = new char[size][size];

        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                m[i][j] = arr[j][size-1-i];
            }
        }

        return m;
    }

    public static char[][]  reflectVertical(char[][] arr) {
        for (int i=0; i<size/2; i++) {
            for (int j=0; j<size; j++) {
                char tmp = arr[size-1-i][j];
                arr[size-1-i][j] = arr[i][j];
                arr[i][j] = tmp;
            }
        }

        char[][] m = arr;
        return m;
    }

    public static boolean compare(char[][] arr1, char[][] arr2) {
        boolean same = true;

        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(arr1[i][j] != arr2[i][j]) {
                    same = false;
                }
            }
        }

        return same;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = 1;
        while(sc.hasNext()) {
            size = sc.nextInt();
            sc.nextLine();
            char[][] left = new char[size][size];
            char[][] right = new char[size][size];

            for(int i=0; i<size; i++) {
                String str1 = sc.nextLine();
                String str2 = str1.substring(0, str1.length()/2);
                String str3 = str1.substring(size+1, str1.length());

                for(int j=0; j<size; j++) {
                    left[i][j] = str2.charAt(j);
                    right[i][j] = str3.charAt(j);
                }
            }

            if(Arrays.deepEquals(left, right)) {
                System.out.printf("Pattern %d was preserved.\n", c);
            } else if(Arrays.deepEquals(rotate90(left), right)) {
                System.out.printf("Pattern %d was rotated 90 degrees.\n", c);
            } else if(Arrays.deepEquals(rotate180(left), right)) {
                System.out.printf("Pattern %d was rotated 180 degrees.\n", c);
            } else if(Arrays.deepEquals(rotate270(left), right)) {
                System.out.printf("Pattern %d was rotated 270 degrees.\n", c);
            } else if(Arrays.deepEquals(reflectVertical(left), right)) {
                System.out.printf("Pattern %d was reflected vertically.\n", c);
            } else if(Arrays.deepEquals(rotate90(left), right)) {
                System.out.printf("Pattern %d was reflected vertically and rotated 90 degrees.\n", c);
            } else if(Arrays.deepEquals(rotate180(left), right)) {
                System.out.printf("Pattern %d was reflected vertically and rotated 180 degrees.\n", c);
            } else if(Arrays.deepEquals(rotate270(left), right)) {
                System.out.printf("Pattern %d was reflected vertically and rotated 270 degrees.\n", c);
            } else {
                System.out.printf("Pattern %d was improperly transformed.\n", c);
            }
            // kappa
            c++;
        }
    }
}
