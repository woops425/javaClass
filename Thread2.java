package ThreadTest;

import java.util.Random;

public class Thread2 implements Runnable{
    private String[] words = {"사과", "바구니", "사탕", "개"};
    private Random random = new Random();

    @Override
    public void run() {
        try {
            for (String word : words) {
                System.out.println(word);
                Thread.sleep(random.nextInt(1000)+1);
            }
        } catch (Exception e) {
            System.out.println("Thread2 interrupted!");
        }
    }
}
