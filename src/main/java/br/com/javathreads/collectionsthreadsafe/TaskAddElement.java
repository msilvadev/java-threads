package br.com.javathreads.collectionsthreadsafe;

import java.util.List;

public class TaskAddElement implements Runnable {
    private List<String> list;
    private int numberOfThread;

    public TaskAddElement(List<String> list, int numberOfThread) {
        this.list = list;
        this.numberOfThread = numberOfThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            list.add("Thread " + numberOfThread + " - " + i);
        }
    }
}
