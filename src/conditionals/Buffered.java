package conditionals;

import java.io.*;

public class Buffered {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a;
        int b;


            int count = Integer.parseInt(br.readLine());
//            bw.newLine();

            for(int i = 0; i < count; i++) {
                String[] parts = br.readLine().split(" ");
                a = Integer.parseInt(parts[0]);
                b = Integer.parseInt(parts[1]);
                int sum = a + b;
                System.out.println(sum);
//                String stringSum = String.valueOf(sum);
//                bw.write(stringSum);
//                bw.newLine();
            }

//            ie.printStackTrace();
//        } finally {
//            try {
//                if (br != null) bw.close();
//                if (bw != null) bw.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
    }
}




