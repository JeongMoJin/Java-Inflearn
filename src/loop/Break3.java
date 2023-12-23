package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum =0;
        int z = 10;
        for(int i = 1; ;i++) {
            sum = sum + i;
            if(sum > 10) {
                System.out.println("합이 10보다 크면 종료 : "+i+" sum="+sum );
                break;
            }
        }
    }
}
