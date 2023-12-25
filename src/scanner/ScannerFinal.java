package scanner;

import java.util.Scanner;

public class ScannerFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int price;
        int count;
        int totalPrice=0;

        while (true){
            System.out.println("1-상품입력");
            System.out.println("2-결제");
            System.out.println("3-프로그램 종료");
            System.out.print("옵션을 선택해주세요: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if(option==1){
                System.out.print("상품명을 입력하세요: ");
                name = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요: ");
                price = scanner.nextInt();
                System.out.print("상품 수량을 입력하세요: ");
                count = scanner.nextInt();

                totalPrice += price * count;
            }

            if(option==2){
                System.out.println("총 비용: "+totalPrice+"//결제가 완료됐습니다.//");
                totalPrice = 0;
            }

            if(option==3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
