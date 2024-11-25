package StudentTest;

public class StudentTest {
    public static void main(String[] args) {
        // 파일명 : StudentTest.java
        // 작성자 : 202010629 글로벌경영학과 박상우
        // 작성일 : 2024.11.09
        // 내용 : Student, ForeignStudent, VisitingStudent 클래스의 메인 클래스

        System.out.println("hw6_1 : 박상우");

        Student Kim = new Student("Kim", 20);
        ForeignStudent Jobs = new ForeignStudent("Jobs", 5, "USA");
        VisitingStudent Lee = new VisitingStudent("Lee", 8, "강원대");

        Kim.print();
        Jobs.print();
        Lee.print();

        int totalTuition = Kim.calculateTuition() + Jobs.calculateTuition() + Lee.calculateTuition();
        System.out.println("등록금 합 : " + totalTuition);
    }
}
