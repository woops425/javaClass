class Television {
    private String model;
    private int price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    // 생성자 1
    public Television() {
        model = "MyTV";
        price = 0;
    }

    // 생성자 2
    public Television(String model) {
        this(model, 0);
    }

    // 생성자 3
    public Television(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
        }

    public String toString() {

        return "모델명:" + model + " 가격:" + price;

    }
}


public class TelevisionTest {
    public static void main(String[] args) {
        // 파일명 : TelevisionTest.java
        // 작성자 : 202010629 글로벌경영학과 박상우
        // 작성일 : 2024.10.14
        // 내용 : Television 클래스를 만들고, 텔레비전들의 정보를 출력하는 프로그램

        System.out.println("hw4_2 : 박상우");

        Television tv1 = new Television();
        Television tv2 = new Television("YourTV");
        Television tv3 = new Television("OurTV", 300000);

        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);


    }
}
