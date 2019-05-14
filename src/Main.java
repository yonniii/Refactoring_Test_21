import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner aScanner = new Scanner(System.in);
        System.out.println("학생 A의 점수를 입력하세요");
        int aScore = aScanner.nextInt();
        boolean isRight = false;
        while (!isRight) {
            if (aScore > 100 || aScore < 0) {
                System.out.println("잘못된 성적입니다.");
                System.out.println("학생의 점수를 입력하세요");
                aScore = aScanner.nextInt();
            }else {
                isRight=true;
            }

        }
        System.out.println("학생 B의 점수를 입력하세요");
        int bScore = aScanner.nextInt();
        while (!isRight) {
            if (bScore > 100 || bScore < 0) {
                System.out.println("잘못된 성적입니다.");
                System.out.println("학생의 점수를 입력하세요");
                bScore = aScanner.nextInt();
            }else {
                isRight=true;
            }
        }
        char aGrade;
        if(aScore>=90) {
            aGrade = 'A';
        }else if(aScore>=80) {
            aGrade = 'B';
        }else if(aScore>=70) {
            aGrade = 'C';
        }else if(aScore>=60) {
            aGrade = 'D';
        }else {
            aGrade = 'F';
        }
        char bGrade;
        if(bScore>=90) {
            bGrade = 'A';
        }else if(bScore>=80) {
            bGrade = 'B';
        }else if(bScore>=70) {
            bGrade = 'C';
        }else if(bScore>=60) {
            bGrade = 'D';
        }else {
            bGrade = 'F';
        }

        System.out.println("A의 점수 : " + bScore);
        System.out.println("A의 점수 : " + bScore);

        System.out.println("B의 점수 : " + bScore);
        System.out.println("B의 점수 : " + bScore);

    }

}