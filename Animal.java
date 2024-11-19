package AnimalTest;

public abstract class Animal {
    // 파일명 : Animal.java
    // 작성자 : 202010629 글로벌경영학과 박상우
    // 작성일 : 2024.11.15
    // 내용 : 추상클래스인 Animal 클래스 구성
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void sound();
    public abstract void newYear();

    @Override
    public abstract String toString();
}
