package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AB_10952 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            while (true) {

                String[] parts = br.readLine().split(" ");
                int a = Integer.parseInt(parts[0]);
                int b = Integer.parseInt(parts[1]);
                if (a == 0 && b == 0) {
                    break;
                } else {
                    int sum = a + b;
                    String strSum = String.valueOf(sum);
                    bw.write(strSum);
                    bw.newLine();
                }
            }
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
