package method;

public class MethodEx1 {
    public static void main(String[] args) {

        int sum = add(1,2,3);
        System.out.println(sum);
        System.out.println(average(sum,3.0));
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }

    public static double average(int sum, double num) {
        return sum/num;
    }
}
