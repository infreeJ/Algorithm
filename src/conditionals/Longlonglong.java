package conditionals;

import java.util.Scanner;

public class Longlonglong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i = i+4) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
