package scanner;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine();

            if(name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // nextLine()은 /n(엔터) 까지 읽는다. 자세히는 이해 안 됐지만, nextLine()의 특성상 생긴 현상


            System.out.println("입력한 이름: "+name+", 나이: "+age);
        }

    }
}
