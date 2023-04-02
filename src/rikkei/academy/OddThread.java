package rikkei.academy;

public class OddThread extends Thread {
    private Thread t;

    public OddThread() {
    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
