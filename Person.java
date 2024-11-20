package AnimalTest;

public class Person extends Animal{
    // 파일명 : Animal.java
    // 작성자 : 202010629 글로벌경영학과 박상우
    // 작성일 : 2024.11.15
    // 내용 :  Animal 클래스의 자식 클래스 Person 클래스 구성
    private int year;

    public Person(String name, int year) {
        super(name);
        this.year = year;
    }

    @Override
    public void sound() {
        System.out.println("안녕 " + getName());
    }

    @Override
    public void newYear() {
        year += 1;
    }

    @Override
    public String toString() {
        return getName() + " " + year + "세";
    }
}