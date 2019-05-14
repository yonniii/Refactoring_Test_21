import com.sun.org.apache.xpath.internal.operations.Variable;
public class Student {//Replace Data value with object

    private char _studentNo;
    private int _score;

    public Student () {
        this._studentNo = ' ';
        this._score = 0;
    }
    public void setScore (int aScore) {
        this._score = aScore;
    }

    public int score () {
        return this._score;
    }


    public void setStudentNo(char aStudentNo) {
        this._studentNo = aStudentNo;
    }

    public char studentNo() {
        return this._studentNo;
    }
    public char grade() {
        if(this._score>=90) {
            return  'A';
        }else if(this._score>=80) {
            return 'B';
        }else if(this._score>=70) {
            return 'C';
        }else if(this._score>=60) {
            return 'D';
        }else {
            return 'F';
        }
    }

    public void studentInfo() {
        System.out.println(this._studentNo + "의 점수 : " + this.score());
        System.out.println(this._studentNo + "의 학점 : " + this.grade());
    }


}