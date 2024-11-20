package AnimalTest;

public class AnimalTest {
    public static void main(String[] args) {
        // 파일명 : AnimalTest.java
        // 작성자 : 202010629 글로벌경영학과 박상우
        // 작성일 : 2024.11.15
        // 내용 : 추상클래스 Animal, 그의 자식 클래스인 Dog, Person 클래스의 메인 클래스 구성

        System.out.println("hw7_1 : 박상우");
        System.out.println();

        Animal[] animals = new Animal[4];
        animals[0] = new Dog("진돌이", 13.5);
        animals[1] = new Dog("진순이", 12.5);
        animals[2] = new Person("홍길동", 20);
        animals[3] = new Person("박길동", 25);

        // 배열 원소들의 정보 출력
        for (int i = 0; i < 4; i++) {
            System.out.println(animals[i].toString());
        }
        System.out.println();
        // 배열 원소들의 sound() 메소드 호출
        for (int i = 0; i < 4; i++) {
            animals[i].sound();
        }
        System.out.println();

        System.out.println("----------1년 후----------");
        for (int i = 0; i < 4; i++) {
            animals[i].newYear();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(animals[i].toString());
        }
        System.out.println();

        System.out.println("----------2년 후----------");
        for (int i = 0; i < 4; i++) {
            animals[i].newYear();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(animals[i].toString());
        }
    }
}
