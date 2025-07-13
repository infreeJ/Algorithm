package bronze;

import java.util.Scanner;

// 오븐 시계
public class OvenTimer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int min = scan.nextInt();
        int time = scan.nextInt();
        int rest = 0;

        min += time;

        if (min >= 60) {
            rest = min / 60;
            min %= 60;
            hour += rest;
            if(hour >= 24) {
                hour -= 24;
            }
        }
        System.out.println(hour + " " + min);
    }
}