package br.com.javathreads.deadlock;

public class TransactionManager {

    public void begin() {

        System.out.println("Begin transaction");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
