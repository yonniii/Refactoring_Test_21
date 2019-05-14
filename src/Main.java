import java.util.Scanner;

public class Main {
    public static Scanner aScanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("학생 A의 점수를 입력하세요");
        int aScore =inputScore();

        System.out.println("학생 B의 점수를 입력하세요");
        int bScore = inputScore();
        char aGrade = getGrade(aScore);

        char bGrade = getGrade(bScore);
        printStudentInfo('A', aScore, aGrade);
        printStudentInfo('B', bScore, bGrade);

    }

    public static int inputScore(){
        int score = aScanner.nextInt();
        while (true) {
            if (score > 100 || score < 0) {
                System.out.println("잘못된 성적입니다.");
                System.out.println("학생의 점수를 입력하세요");
                score = aScanner.nextInt();
            }else {
                return score;
            }

        }
    }
    public static void printStudentInfo(char studentNum, int score, char grade) {
        System.out.println(studentNum + "의 점수 : " + score);
        System.out.println(studentNum + "의 학점 : " + grade);

    }
    public static char getGrade(int score) {
        if(score>=90) {
            return 'A';
        }else if(score>=80) {
            return 'B';
        }else if(score>=70) {
            return 'C';
        }else if(score>=60) {
            return 'D';
        }else {
            return 'F';
        }
    }


}