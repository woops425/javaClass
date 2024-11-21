package StudentTest;

public class Student {
    // 파일명 : Student.java
    // 작성자 : 202010629 글로벌경영학과 박상우
    // 작성일 : 2024.11.09
    // 내용 : Student 클래스 정의

    private String name; // 이름
    private int credit; // 신청학점

    public Student(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int calculateTuition() {
        if (credit > 6) {
            return 3000000;
        }
        else {
            return credit * 200000;
        }
    }

    public void print() {
        System.out.println("이름 : " + name + ", 신청학점수 : " + credit);
    }
}
