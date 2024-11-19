package AnimalTest;

public class Dog extends Animal {
    // 파일명 : Animal.java
    // 작성자 : 202010629 글로벌경영학과 박상우
    // 작성일 : 2024.11.15
    // 내용 :  Animal 클래스의 자식 클래스 Dog 클래스 구성
    private double speed;

    public Dog(String name, double speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public void sound() {
        System.out.println("멍멍 " + getName());
    }

    @Override
    public void newYear() {
        speed += 5;
    }

    @Override
    public String toString() {
        return getName() + " 시속" + speed + "km";
    }
}
