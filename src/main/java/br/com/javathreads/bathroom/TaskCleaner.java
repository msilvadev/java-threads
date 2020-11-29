package br.com.javathreads.bathroom;

public class TaskCleaner implements Runnable {

    private Bathroom bathroom;

    public TaskCleaner(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        while (true){
            bathroom.cleanBathroom();
            sleep(20000);
        }
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
