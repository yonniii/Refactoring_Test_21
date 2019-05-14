import java.util.Scanner;

public class Main {
    public static Scanner aScanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student aStudent = new Student();
        Student bStudent = new Student();

        aStudent.setStudentNo('A');
        System.out.println("학생 A의 점수를 입력하세요");
        int aScore = inputScore(aStudent.studentNo());
        aStudent.setScore(aScore);

        bStudent.setStudentNo('B');
        System.out.println("학생 B의 점수를 입력하세요");
        int bScore = inputScore(bStudent.studentNo());
        bStudent.setScore(bScore);
        aStudent.studentInfo();
        bStudent.studentInfo();

    }

    public static int inputScore(char studentNo){
        System.out.println("학생" + studentNo + "의 점수를 입력하세요");
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