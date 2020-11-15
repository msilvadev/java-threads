
package br.com.javathreads;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class ActionButton implements ActionListener {
    private AtomicInteger iteratorThreadName = new AtomicInteger();
    private Runnable multiplyTask;
    private boolean withoutNewThread = true;

    public ActionButton(JTextField first, JTextField second, JLabel result) {
        withoutNewThread = Boolean.valueOf(System.getProperty("withoutNewThread"));

        multiplyTask = new MultiplyTask(first, second, result);
    }

    public void actionPerformed(ActionEvent e) {
        if (withoutNewThread) {
			actionPerformedWithoutNewThread(e);
		} else {
			actionPerformedWithNewThread(e);
        }
    }

    public void actionPerformedWithNewThread(ActionEvent e) {
        Thread calcThread = new Thread(multiplyTask, "Thread Multiply Task-" + iteratorThreadName.addAndGet(1));
        calcThread.start();
    }

    public void actionPerformedWithoutNewThread(ActionEvent e) {
        multiplyTask.run();
    }

}