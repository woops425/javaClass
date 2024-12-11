package ThreadTest;

import java.util.Random;

public class Thread1 implements Runnable{
    private String[] words = {"apple", "basket", "candy", "dog"};
    private Random random = new Random();

    @Override
    public void run() {
        try {
            for (String word : words) {
                System.out.println(word);
                Thread.sleep(random.nextInt(1000) + 1);
            }
        } catch (Exception e) {
            System.out.println("Thread1 interrupted!");
        }
    }
}
