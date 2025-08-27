package bronze;

import java.util.Scanner;

public class Cook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input1 = scan.nextLine().split(" ");
        String[] input2 = scan.nextLine().split(" ");
        String[] input3 = scan.nextLine().split(" ");
        String[] input4 = scan.nextLine().split(" ");
        String[] input5 = scan.nextLine().split(" ");

        String[][] inputArr = {input1, input2, input3, input4, input5};

        int[] scoreArr = new int[5];

        int highScore = 0;
        int highIndex = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                scoreArr[i] = scoreArr[i] + Integer.parseInt(inputArr[i][j]);
            }

            if (highScore < scoreArr[i]) {
                highScore = scoreArr[i];
                highIndex = i + 1;
            }
        }

        System.out.print(highIndex + " " + highScore);
    }
}




















