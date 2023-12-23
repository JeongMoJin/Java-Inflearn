package cond;

public class If6 {
    public static void main(String[] args) {
        int item = 15000;
        int age = 10;

        if (item >= 10000) {
            item -= 1000;
            System.out.println("10000원 이상 구매, 1000원 할인" );
        }
        else if (age <= 10) {
            item -= 1000;
            System.out.println("어린이 1000원 할인");
        }
        System.out.println("아이템 가격은 " + item + "원 입니다.");

        if (true) System.out.println("if문에서 실행됨");
    }
}
