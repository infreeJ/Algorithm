package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SortSelection_23881 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] input = br.readLine().split(" ");
            int size = Integer.parseInt(input[0]);
            int change = Integer.parseInt(input[1]);

            String[] arrayInput = br.readLine().split(" ");
            int[] intArray = new int[size];
            for(int i=0; i<arrayInput.length; i++) {
                intArray[i] = Integer.parseInt(arrayInput[i]);
            }

            // 3 5 7 2


            for(int i=size-2; i>0; i--) {
                int tmp = intArray[i];
                int j = i+1;
                while (j <= size-1 && tmp > intArray[j]) {
                    tmp = intArray[j];
                    intArray[j] = intArray[i];
                    j++;
                }
            }

            /*
            for(int i=1; i < n; i++) {
                int tmp = num[i]; // 1번 인덱스
                int j = i-1; // 0번 인덱스부터 4번 까지 순환
                while(j >= 0 && tmp < num[j]) {
                    num[j+1] = num[j];
                    j--;
                }
                num[j+1] = tmp;
            }
             */


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




