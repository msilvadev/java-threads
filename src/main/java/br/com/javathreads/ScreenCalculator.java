package br.com.javathreads;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScreenCalculator {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Time-consuming Multiplication");

        JTextField first = new JTextField(10);
        JTextField second = new JTextField(10);
        JButton button = new JButton(" = ");
        JLabel result = new JLabel("           ?          ");

        // When click on the button will be executed the class ActionButton
        button.addActionListener(new ActionButton(first, second, result));

        JPanel painel = new JPanel();
        painel.add(first);
        painel.add(new JLabel("x"));
        painel.add(second);
        painel.add(button);
        painel.add(result);

        janela.add(painel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
    }
}


