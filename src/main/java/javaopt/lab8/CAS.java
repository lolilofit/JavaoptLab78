package javaopt.lab8;

import java.util.concurrent.atomic.AtomicBoolean;

public class CAS {
    public static void main(String[] args) throws InterruptedException {
        final AtomicBoolean flag = new AtomicBoolean(false);

        Thread cas = new Thread() {
            @Override
            public void run() {
                while(!flag.compareAndSet(true, false)) {
                    //wait until something happens
                    System.out.println("Still waiting");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Spin lock end!");
            }
        };

        System.out.println("Start spin lock");

        cas.start();

        System.out.println("Wait something...");

        Thread.sleep(10000);

        flag.set(true);
    }
}
