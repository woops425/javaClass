package StudentTest;

public class VisitingStudent extends Student{
    // 파일명 : Student.java
    // 작성자 : 202010629 글로벌경영학과 박상우
    // 작성일 : 2024.11.09
    // 내용 : VisitingStudent 클래스 정의

    private String homeSchool;

    public VisitingStudent(String name, int credit, String homeSchool) {
        super(name, credit);
        this.homeSchool = homeSchool;
    }

    public String getHomeSchool() {
        return homeSchool;
    }

    public void setHomeSchool(String homeSchool) {
        this.homeSchool = homeSchool;
    }

    @Override
    public int calculateTuition() {
        return getCredit() * 100000;
    }

    @Override
    public void print() {
        System.out.println("이름 : " + getName() + ", 신청학점수 : " + getCredit() + ", 소속학교명 : " + getHomeSchool());
    }
}
