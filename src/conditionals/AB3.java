package conditionals;

import java.util.Scanner;

public class AB3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeat = scan.nextInt();
        for (int i = 0; i < repeat; i++) {
            System.out.println(scan.nextInt() + scan.nextInt());
        }
    }
}
