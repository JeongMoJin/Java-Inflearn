package method;

public class MethodEx2 {
    public static void main(String[] args) {

        String message = "Hello, World";

        message(message,3);
    }

    public static String message(String str, int count) {
        for (int i=1; i<=count;i++){
            System.out.println(str);
        }
        return str;
    }
}
