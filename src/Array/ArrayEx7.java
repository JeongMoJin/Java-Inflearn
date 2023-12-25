package Array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[][] score = new int[4][3];
        int[] sum = new int[4];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 3; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요 ");
            for (int j = 0; j <= 2; j++) {
                System.out.print(j+1+"과목 점수: ");
                score[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i <= 3; i++) {
            for (int j=0; j<=2; j++){
                sum[i] += score[i][j];
            }
            System.out.println((i+1)+"번 학생의 총점: "+sum[i]+", 평균: "+(double)sum[i]/3);
        }
    }
}
