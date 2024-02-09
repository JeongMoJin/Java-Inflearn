package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine(); // 입력을 String 으로 가져온다.
        System.out.println("입력한 문자열 : "+ str);

        System.out.print("정수를 입력하세요 : ");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: "+doubleValue);

        //두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
    }
}
