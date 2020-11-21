package br.com.javathreads.bathroom;

public class Bathroom {

    public void doNumber1() {
        // This printing is performed in parallel because it is outside the synchronized block
        String name = Thread.currentThread().getName();
        System.out.println(name + " knocking on the door...");

        // Atomically executed, once and through one thread at a time
        synchronized (this) {
            System.out.println(name + " entering in bathroom");
            System.out.println(name + " doing fast something");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + " washing the hands");
            System.out.println(name + " going out of the bathroom");
        }
    }

    public void doNumber2() {
        // This printing is performed in parallel because it is outside the synchronized block
        String name = Thread.currentThread().getName();
        System.out.println(name + " knocking on the door...");

        // Atomically executed, once and through one thread at a time
        synchronized (this) {
            System.out.println(name + " entering in bathroom");
            System.out.println(name + " doing something time-consuming");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + " washing the hands");
            System.out.println(name + " going out of the bathroom");
        }
    }
}