package br.com.javathreads.bathroom;

public class ConsumeBathroom {

    public static void main(String[] args) throws InterruptedException {
        Bathroom bathroom = new Bathroom();

        Thread invited1 = new Thread(new TaskNumber1(bathroom), "Thread1 > Jhon");
        Thread invited2 = new Thread(new TaskNumber1(bathroom), "Thread2 > Paul");
//        Thread invited3 = new Thread(new TaskNumber1(bathroom), "Thread1 > Mary");
//        Thread invited4 = new Thread(new TaskNumber2(bathroom), "Thread2 > Anna");

        invited1.start();
        invited2.start();
//        invited3.start();
//        invited4.start();
    }
}
