package cond;

public class CondEx1 {
    public static void main(String[] args) {
        int score = 90;

        if (score >= 90) {
            System.out.println("score : "+score);
            System.out.println("학점은 A입니다.");
        } else if (80 <= score && score < 90){
            System.out.println("score : "+score);
            System.out.println("학점은 B입니다.");
        } else if (70 <= score && score <80) {
            System.out.println("score : "+score);
            System.out.println("학점은 C입니다.");
        } else if (60 <= score && score <70) {
            System.out.println("score : "+score);
            System.out.println("학점은 D입니다.");
        } else {
            System.out.println("score : "+score);
            System.out.println("학점은 F입니다.");
        }
    }
}
