package Array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] fiveInt = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 1; i <= fiveInt.length; i++) {
            fiveInt[fiveInt.length-i] = scanner.nextInt();
        }
        for (int i = 0; i < fiveInt.length; i++) {
            if (i==fiveInt.length-1){
                System.out.print(fiveInt[i]);
            }else {
                System.out.print(fiveInt[i]+", ");
            }
        }
    }
}
