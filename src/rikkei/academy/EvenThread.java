package rikkei.academy;

public class EvenThread extends Thread {
    private Thread t;

    public EvenThread() {

    }

    @Override
    public void run() {
        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);
            try{
                Thread.sleep(15);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
