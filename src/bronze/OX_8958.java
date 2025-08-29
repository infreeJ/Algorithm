package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OX_8958 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        scan.nextLine();
        String ox;
        for (int i = 0; i < input; i++) {
            ox = scan.nextLine();
            int tmp = 0;
            int sum = 0;

            for (int j = 0; j < ox.length(); j++) {

                if (ox.charAt(j) == 'O') {
                    tmp++;
                    sum += tmp;
                } else {
                    tmp = 0;
                }

            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
















