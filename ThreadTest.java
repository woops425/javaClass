package ThreadTest;

import java.util.Random;

public class ThreadTest {
    private static String[] testWords = {"1000", "2000", "3000", "4000"};
    private static Random random = new Random();

    public static void main(String[] args) {
        // 파일명 : ThreadTest.java
        // 작성자 : 202010629 글로벌경영학과 박상우
        // 작성일 : 2024.12.02
        // 내용 : Thread 구현
        System.out.println("hw18_1 : 박상우");

        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();

        try {
            for (String word : testWords) {
                System.out.println(word);
                Thread.sleep(random.nextInt(1000)+1);
            }
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("ThreadTest interrupted!");
        }
        System.out.println("2024-2학기 끝!");
    }
}
