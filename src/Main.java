import java.util.Scanner;

public class Main {
    public static Scanner aScanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student aStudent = new Student();
        Student bStudent = new Student();

        aStudent._studentNo = 'A';
        System.out.println("학생 A의 점수를 입력하세요");
        aStudent._score = inputScore(aStudent._studentNo);

        bStudent._studentNo = 'B';
        System.out.println("학생 B의 점수를 입력하세요");
        bStudent._score = inputScore(bStudent._studentNo);
        aStudent.studentInfo();
        bStudent.studentInfo();

    }

    public static int inputScore(char studentNo){
        int score = aScanner.nextInt();
        while (true) {
            if (score > 100 || score < 0) {
                System.out.println("잘못된 성적입니다.");
                System.out.println("학생" + studentNo + "의 점수를 입력하세요");
                score = aScanner.nextInt();
            }else {
                return score;
            }

        }
    }

}