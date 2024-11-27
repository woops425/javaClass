import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        double radius = 1.5;
        double circleArea = Math.PI * Math.pow(radius, 2); // PI * r^2
        double pow = Math.pow(3,10);
        double sqrt = Math.sqrt(8);

        // 파일명 : Wrapper.java
        // 작성자 : 202010629 글로벌경영학과 박상우
        // 작성일 : 2024.11.19
        // 내용 : Wrapper Class인 Integer, String 클래스 기능 활용

        System.out.println("hw8_1 : 박상우");

        System.out.println(circleArea);
        System.out.println(pow);
        System.out.println(sqrt);

        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호 입력(-포함) :");
        String id = sc.nextLine();

        String frontPart = id.substring(0, 6);
        String backPart = id.substring(7);
        System.out.println("앞자리 = " + frontPart);
        System.out.println("뒷자리 = " + backPart);

        Integer frontNumber = Integer.parseInt(frontPart);
        Integer backNumber = Integer.parseInt(backPart);
        int sum = frontNumber + backNumber;
        System.out.println("합 = " + sum);
    }
}
