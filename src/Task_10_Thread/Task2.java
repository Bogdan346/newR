package Task_10_Thread;

class SynThread implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {

            Task2.inc();
        }
    }
}


public class Task2 {

    private static int a;

    public static void main(String[] args) {


        Thread t1 = new Thread(new SynThread());
        Thread t2 = new Thread(new SynThread());

        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }

    public static synchronized void inc() {
        a++;
    }
}


