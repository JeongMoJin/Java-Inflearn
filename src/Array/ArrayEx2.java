package Array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int[] fiveInt = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < 5; i++) {
            fiveInt[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (i==4){
                System.out.print(fiveInt[i]);
            }else {
                System.out.print(fiveInt[i]+", ");
            }
        }
    }
}
