package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a =5;
        int b =2; // 변수 초기화

        // 덧셈
        int sum = a+b;
        System.out.println("a + b = " + sum); // 출력 a + b = 7

        // 덧셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // a - b = 3

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a/b; // 인트형 끼리 계산은 소수점 표현 안됨
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
