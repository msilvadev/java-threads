package br.com.javathreads.exercices;

public class SimpleThread {

    public static void main(String... args) {
        // Create with anonymous class into the Thread’s constructor
        Thread task1 = new Thread(new Runnable() {
            public void run() { System.out.println("Task #1 is running"); }
        });
        task1.start();

        // Lambda Runnable
        Runnable task2 = () -> { System.out.println("Task #2 is running"); };
        // start the thread
        new Thread(task2).start();

        // Lambda expression into the Thread’s constructor
        new Thread(() -> { System.out.println("Task #3 is running"); }).start();
    }
}
