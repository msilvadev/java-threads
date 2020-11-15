package br.com.javathreads;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScreenCalculator {

    public static void main(String[] args) {

        JFrame window = new JFrame("Time-consuming Multiplication");

        JTextField first = new JTextField(10);
        JTextField second = new JTextField(10);
        JButton button = new JButton(" = ");
        JLabel result = new JLabel("           ?          ");

        // When click on the button will be executed the class ActionButton
        button.addActionListener(new ActionButton(first, second, result));

        JPanel panel = new JPanel();
        panel.add(first);
        panel.add(new JLabel("x"));
        panel.add(second);
        panel.add(button);
        panel.add(result);

        window.add(panel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
    }
}


