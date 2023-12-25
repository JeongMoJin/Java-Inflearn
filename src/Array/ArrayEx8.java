package Array;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력해주세요: ");
        int count = scanner.nextInt();

        int[][] score = new int[count][3];
        int[] sum = new int[count];

        for (int i = 0; i <= count-1; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요 ");
            for (int j = 0; j <= 2; j++) {
                System.out.print(j+1+"과목 점수: ");
                score[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i <= count-1; i++) {
            for (int j=0; j<=2; j++){
                sum[i] += score[i][j];
            }
            System.out.println((i+1)+"번 학생의 총점: "+sum[i]+", 평균: "+(double)sum[i]/3);
        }
    }
}
