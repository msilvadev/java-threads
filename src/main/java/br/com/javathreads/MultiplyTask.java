package br.com.javathreads;

import javax.swing.*;
import java.math.BigInteger;

public class MultiplyTask implements Runnable{

    private JTextField first;
    private JTextField second;
    private JLabel result;

    public MultiplyTask(JTextField first, JTextField second, JLabel result) {
        this.first = first;
        this.second = second;
        this.result = result;
    }

    public void run() {
        System.out.println("Running MultiplyTask " + Thread.currentThread().getName());

        long valor1 = Long.parseLong(first.getText());
        long valor2 = Long.parseLong(second.getText());
        BigInteger calculo = new BigInteger("0");

        for (int i = 0; i < valor1; i++) {
            for (int j = 0; j < valor2; j++) {
                calculo = calculo.add(new BigInteger("1"));
            }
        }

        result.setText(calculo.toString());
        System.out.println("Ended MultiplyTask " + Thread.currentThread().getName());
    }
}
