package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("1. 입력한 숫자가 모두 더해집니다.");
            System.out.println("2. 0을 입력하면 종료되고, 숫자 합이 출력됩니다.");
            System.out.print("숫자를 입력하세요:");
            int num = scanner.nextInt(); // 입력란
            if (num==0){
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
