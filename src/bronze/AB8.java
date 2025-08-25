package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AB8 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());

            int a = 0;
            int b = 0;
            int sum = 0;
            for (int i=0; i < n; i++) {
                String[] input = br.readLine().split(" ");
                a = Integer.parseInt(input[0]);
                b = Integer.parseInt(input[1]);
                sum = a + b;
                String strSum = String.valueOf(sum);
                bw.write("Case #" + (i+1) + ": " + String.valueOf(a) + " + " + String.valueOf(b) + " = " + strSum);
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
