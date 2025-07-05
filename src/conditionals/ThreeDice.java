package conditionals;

import java.util.Scanner;

// 주사위 세개
public class ThreeDice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int oneDice = scan.nextInt();
        int twoDice = scan.nextInt();
        int threeDice = scan.nextInt();

        int money = 0;

        if (oneDice == twoDice && oneDice == threeDice) {
            money = 10000 + oneDice * 1000;
        } else if (oneDice == twoDice) {
            money = 1000 + oneDice * 100;
        } else if (oneDice == threeDice) {
            money = 1000 + oneDice * 100;
        } else if (twoDice == threeDice) {
            money = 1000 + twoDice * 100;
        }

        if (oneDice != twoDice && oneDice != threeDice && twoDice != threeDice) {
            money = Math.max(Math.max(oneDice, twoDice),Math.max(oneDice, threeDice)) * 100;
        }
        System.out.println(money);
    }
}
