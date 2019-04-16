package Task_10_Thread;

import java.util.Random;
class SomeThread implements Runnable {



    public static void rnd() {
        Random random = new Random();
        int arr[] = new int[5];
        for (int i : arr) {
            arr[i] = random.nextInt(20);
            System.out.println(arr[i]);
        }
    }


    @Override
    public void run() {
       rnd();
    }
}


public class Task1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new SomeThread());
        t1.start();
        Thread t2 = new Thread(new SomeThread());
        t2.start();
        Thread t3 = new Thread(new SomeThread());
        t3.start();
        Thread t4 = new Thread(new SomeThread());
        t4.start();
        Thread t5 = new Thread(new SomeThread());
        t5.start();
        Thread t6 = new Thread(new SomeThread());
        t6.start();
        Thread t7 = new Thread(new SomeThread());
        t7.start();
        Thread t8 = new Thread(new SomeThread());
        t8.start();
        Thread t9 = new Thread(new SomeThread());
        t9.start();
        Thread t10 = new Thread(new SomeThread());
        t10.start();

    }
}



