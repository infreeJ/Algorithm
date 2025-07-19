package silver;


// 4번째 시도(삽입 정렬)
import java.io.*;

public class sortingNumbers2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());
            int[] num = new int[n];

            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(br.readLine());
            }

            int temp = 0;

            for (int i=0; i < n-1; i++) {
                temp = num[i];
                for (int j=i; j < n-1; j++) {
                    if(temp > num[j+1]) {
                        temp = num[j+1];
                    }
                }
                num[i] = temp;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 5 3 2 4 1

/*
temp = 5
5 > 3

 */



//public class sortingNumbers2 {
//    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        try {
//            int n = Integer.parseInt(br.readLine());
//            int[] num = new int[n];
//            for (int i = 0; i < n; i++) {
//                num[i] = Integer.parseInt(br.readLine());
//            }
//
//            for (int i = 0; i < n-1; i++) { // 5 4 1 2 3
//                int set = i;
//                for (int j = i+1; j < n; j++) {
//                    if (num[set] > num[j]) {
//                        set = j;
//                    }
//                }
//                int tmp = num[set];
//                num[set] = num[i];
//                num[i] = tmp;
//            }
//
//            for (int i = 0; i < n; i++) {
//                String numString = String.valueOf(num[i]);
//                bw.write(numString);
//                bw.newLine();
//            }
//            bw.flush();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}



//// 2번째 시도(버블 정렬)
//import java.io.*;
//
//public class sortingNumbers2 {
//    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        try {
//            int n = Integer.parseInt(br.readLine());
//            int[] num = new int[n];
//            for (int i = 0; i < n; i++) {
//                num[i] = Integer.parseInt(br.readLine());
//            }
//
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n-1; j++) {
//                    if(num[j] > num[j+1] ) {
//                        int tmp = num[j];
//                        num[j] = num[j+1];
//                        num[j+1] = tmp;
//                    }
//                }
//            }
//
//            for (int i = 0; i < n; i++) {
//                String numString = String.valueOf(num[i]);
//                bw.write(numString);
//                bw.newLine();
//            }
//            bw.flush();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}



//// 처음 제출한 코드(실패 원인 : 느린 입출력)
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int n = scan.nextInt();
//        int[] num = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            num[i] = scan.nextInt();
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n-1; j++) {
//                if(num[j] > num[j+1] ) {
//                    int tmp = num[j];
//                    num[j] = num[j+1];
//                    num[j+1] = tmp;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(num[i]);
//        }
//    }
//}