package bronze;

import java.util.Scanner;

public class Max_2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int index = 0;
        int max = 0;
        for(int i=0; i<9; i++) {
            input = scan.nextInt();
            if(input > max) {
                max = input;
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
