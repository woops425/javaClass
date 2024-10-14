import java.util.Scanner;

public class MonthSeason2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.print("숫자를 입력하시오 : ");
        month = sc.nextInt();

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("잘못된 입력입니다. 1~12 사이 숫자를 다시 입력하세요.");
                break;
        }
    }
}
