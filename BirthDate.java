import java.util.Scanner;

public class BirthDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 파일명 : BirthDate.java
        // 작성자 : 202010629 글로벌경영학과 박상우
        // 작성일 : 2024.09.21
        // 내용 : 주민등록번호로부터 생년월일을 알아보는 프로그램 작성
        System.out.println("hw2_1 : 박상우");
        System.out.print("주민등록번호 앞자리 입력 : ");
        String firstDigit = sc.nextLine();

        System.out.print("주민등록번호 뒷자리 입력 : ");
        String lastDigit = sc.nextLine();

        // lastDigit의 입력 값을 활용해 삼항 연산자로 1900년대생인지, 2000년대생인지 확인
        int century = (lastDigit.charAt(0) == 1 || lastDigit.charAt(1) == 2) ? 1900 : 2000;
        // 몇년대생인지 확인한 값을 활용하여 출생년도를 결합
        // 입력한 값의 인덱스 값을 활용하여 생년월일 도출
        int year = Integer.parseInt(firstDigit.substring(0,2));
        year += century;

        int month = Integer.parseInt(firstDigit.substring(2, 4));
        int day = Integer.parseInt(firstDigit.substring(4, 6));

        System.out.println("생년월일은 다음과 같습니다.");
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

    }
}
