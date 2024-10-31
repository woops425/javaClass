public class TelevisionTest {
    public static void main(String[] args) {
        // 파일명 : TelevisionTest.java
        // 작성자 : 202010629 글로벌경영학과 박상우
        // 작성일 : 2024.10.28
        // 내용 : Television 클래스의 메인 클래스인 TelevisionTest. Television 클래스의 정적 변수를 호출

        System.out.println("hw5_1 : 박상우");

        System.out.println("지금까지 생성된 텔레비전 수는 ? : " + Television.getNumberOfTVs());
        Television tv1 = new Television();
        Television tv2 = new Television("YourTV");
        Television tv3 = new Television("OurTV", 300000);

        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);

        System.out.println("지금까지 생성된 텔레비전 수는 ? : " + Television.getNumberOfTVs());


    }
}
