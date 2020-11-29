package br.com.javathreads.bathroom;

public class ConsumeBathroom {

    public static void main(String[] args) throws InterruptedException {
        Bathroom bathroom = new Bathroom();

        Thread invited1 = new Thread(new TaskNumber1(bathroom), "Jhon");
        Thread invited2 = new Thread(new TaskNumber2(bathroom), "Paul");
        Thread cleaner = new Thread(new TaskCleaner(bathroom), "Cleaner");
        cleaner.setDaemon(true);
//        Thread invited3 = new Thread(new TaskNumber1(bathroom), "Thread1 > Mary");
//        Thread invited4 = new Thread(new TaskNumber2(bathroom), "Thread2 > Anna");

        invited1.start();
        invited2.start();
        cleaner.start();
//        invited3.start();
//        invited4.start();
    }
}
