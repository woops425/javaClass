package StudentTest;

public class ForeignStudent extends Student{
    // 파일명 : Student.java
    // 작성자 : 202010629 글로벌경영학과 박상우
    // 작성일 : 2024.11.09
    // 내용 : ForeignStudent 클래스 정의

    private String nationality; // 국적

    public ForeignStudent(String name, int credit, String nationality) {
        super(name, credit);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public void print() {
        System.out.println("이름 : " + getName() + ", 신청학점수 : " + getCredit() + ", 국적 : " + getNationality());
    }
}