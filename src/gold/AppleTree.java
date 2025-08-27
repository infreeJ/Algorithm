package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AppleTree {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int size = Integer.parseInt(br.readLine());
            String[] parts;
            int[] intParts = new int[size];
            int[][] tree = new int[size][size];

            for(int i = 0; i < size; i++) {
                parts = br.readLine().split(" ");
                for(int j = 0; j < size; j++) {
                    intParts[j] = Integer.parseInt(parts[j]);
                }

                tree[i] = intParts.clone();
            }

            int tmp = 0;
            int sum = 0;

            int plus = 0;
            for(int i=0; i<size; i++) {


                plus++;
            }


            if(sum < tmp) {
                sum = tmp;
            }

            System.out.println(sum);



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
