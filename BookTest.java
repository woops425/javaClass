class Book {
    String title; // 제목
    int price; // 가격
    int year; // 발행연도

    // 정보출력 메소드
    void print() {
        System.out.println("제목 : " + title + ", 가격 : " + price + ", 발행연도 : " + year);
    }
    // 정액할인 메소드
    void discount(int discountPay) {
        price -= discountPay;
    }
    void discount() {
        if (year == 2014) {
            price *= 0.9;
        } else if (year < 2014) {
            price *= 0.5;
        }
        price = (int) price;
    }
}

public class BookTest {
    public static void main(String[] args) {
        // 파일명 : BookTest.java
        // 작성자 : 202010629 글로벌경영학과 박상우
        // 작성일 : 2024.10.07
        // 내용 : 책을 나타내는 Book 클래스를 정의하고, 이를 이용하여 책 정보를 출력하는 프로그램
        System.out.println("hw4_1 : 박상우");

        // myBook 객체 생성
        Book myBook = new Book();
        myBook.title = "java";
        myBook.price = 10000;
        myBook.year = 2014;

        // yourBook 객체 생성
        Book yourBook = new Book();
        yourBook.title = "database";
        yourBook.price = 20000;
        yourBook.year = 2013;

        // ourBook 객체 생성
        Book ourBook = new Book();
        ourBook.title = "computer";
        ourBook.price = 30000;
        ourBook.year = 2009;

        // 세 책의 정보 출력
        myBook.print();
        yourBook.print();
        ourBook.print();

        // 세 책을 1000원 정액 할인
        myBook.discount(1000);
        yourBook.discount(1000);
        ourBook.discount(1000);

        // 세 책을 재고 할인
        myBook.discount();
        yourBook.discount();
        ourBook.discount();

        // 세 책의 정보 다시 출력
        myBook.print();
        yourBook.print();
        ourBook.print();
    }
}
