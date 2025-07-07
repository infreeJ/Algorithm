package conditionals;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int priceSum = scan.nextInt();
        int a = scan.nextInt();

        int price = 0;
        int s = 0;

        int d = 0;

        for (int i = 1; i <= a; i++) {
            price = scan.nextInt();
            s = scan.nextInt();
            d = d + price * s;
        }
        if(priceSum == d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
