package Array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int counut = scanner.nextInt();

        int[] fiveInt = new int[counut];
        int sum = 0;
        System.out.println(counut+"개의 정수를 입력하세요 : ");
        for (int i = 0; i < counut; i++) {
            sum  += scanner.nextInt();
        }
        System.out.println("입력한 정수의 합계: "+sum);
        System.out.println("입력한 정수의 평균: "+(double)sum/counut);
    }
}
