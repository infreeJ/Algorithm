package bronze;

import java.util.Scanner;

public class star_2438 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j-1 < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
