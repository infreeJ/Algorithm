package bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SevenDwarfs_3040 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] hat = new int[9];
        int sum = 0;

        for(int i=0; i<9; i++) {
            hat[i] = scan.nextInt();
            sum = sum + hat[i];
        }

        int tmp = sum;
        int indexI = 0;
        int indexJ = 0;

        while(true) {
            for (int i=0; i<9; i++) {
                tmp = tmp - hat[i];

                for(int j=i+1; j<9; j++) {
                    tmp = tmp - hat[j];
                    indexJ = j;
                }
                System.out.println("여기까지 됨");

                if(tmp == 100) {
                    sum = tmp;
                    indexI = i;
                    break;
                } else {
                    tmp = sum;
                }
            }
        }


        int[] realDwarfs = new int[7];

        for(int i=0; i<7; i++) {
            if(i != indexI && i != indexJ) {
                realDwarfs[i] = hat[i];
                System.out.println(realDwarfs[i]);
            }
        }

    }
}
