package com.sample.app;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Latihan1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello World");
        int inputButton = JOptionPane.showConfirmDialog(null, 
            "Do you like Rice?",
            "Confirm",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.ERROR_MESSAGE);
        System.out.println("Value input button: "+inputButton);

        // type message:
        // JOptionPane.ERROR_MESSAGE
        // JOptionPane.INFORMATION_MESSAGE
        // JOptionPane.QUESTION_MESSAGE

        String inputTextBox = JOptionPane.showInputDialog(null, "Enter your name", "Mervin");
        System.out.println("Value input text: "+inputTextBox);
    }
}
