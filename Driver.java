public class Driver {
    public static void main(String[] args) {
        // 파일명 : Driver.java
        // 작성자 : 202010629 글로벌경영학과 박상우
        // 작성일 : 2024.11.16
        // 내용 : Speakable 인터페이스를 활용하여 Dog, AlarmClock 클래스 이름을 쓰지 않고 익명 클래스 생성

        System.out.println("hw7_2 : 박상우");

        Speakable myDog = new Speakable() {
            public void speak() {
                System.out.println("멍멍");
            }
        };
        myDog.speak();

        Speakable clock = new Speakable() {
            private int number = 5;

            public void speak() {
                for (int i=0; i < number; i++) {
                    System.out.print("삐");
                }
                System.out.println();
                number = number + 3;
            }
        };
        clock.speak();
        clock.speak();
    }
}

interface Speakable {
    void speak();
}
