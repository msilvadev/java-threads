package br.com.javathreads.bathroom;

public class TaskNumber1 implements Runnable {

    private Bathroom bathroom;

    public TaskNumber1(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.doNumber1();
    }
}
