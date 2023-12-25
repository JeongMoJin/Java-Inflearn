package scanner;

import java.util.Scanner;

public class ChangeVarEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력해주세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력해주세요: ");
        int num2 = scanner.nextInt();

        if (num1>num2) {
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
//        int numResult = num2 - num1;
            int num1Plus = num1+1;
        System.out.print("두 숫자 사이의 모든 정수: " + num1);
        for (;num1Plus<=num2;num1Plus++) {
            System.out.print(","+num1Plus);
        }
    }
}
