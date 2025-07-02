package conditionals;

import java.util.Scanner;

public class OvenTimer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int min = scan.nextInt();
        int time = scan.nextInt();
        int rest;

        if (time >= 60) {
            rest = time % 60;
            min = min + rest;
            hour += time / 60;
        }

        if (time < 60) {
            min += time;
        }

        if (hour >= 24) {
            hour -= 24;
        }
        System.out.println(hour + " " + min);
    }
}