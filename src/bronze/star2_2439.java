package bronze;

import java.util.Scanner;

public class star2_2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j-1 < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
