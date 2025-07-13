package bronze;

import java.util.Scanner;

public class sortingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(num[j] > num[j+1] ) {
                    int tmp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
    }
}
