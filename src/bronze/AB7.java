package bronze;

import java.io.*;

public class AB7 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        try {
            int count = Integer.parseInt(br.readLine());
            for (int i = 0; i < count; i++) {
                String[] input = br.readLine().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);
                String strInt = String.valueOf(a + b);
                int iCnt = i+1;
                bw.write("Case #" + iCnt + ": " + strInt);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException ie) {
            ie.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}