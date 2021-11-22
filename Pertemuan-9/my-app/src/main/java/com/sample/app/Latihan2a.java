package com.sample.app;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Latihan2a {
    public static void main(String[] args) {
        String label ="";
        int inputButton = JOptionPane.showConfirmDialog(null, 
            "Apakah kamu suka burger?",
            "Pertanyaan",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if (inputButton == 0) {
            label = "Saya suka burger";
        } else if (inputButton == 1) {
            label = "Saya tidak suka burger";
        } else if (inputButton == 2) {
            label = "Tidak memilih";
        }
        JOptionPane.showMessageDialog(null, label, "Pilihan", JOptionPane.INFORMATION_MESSAGE);
    }
}
