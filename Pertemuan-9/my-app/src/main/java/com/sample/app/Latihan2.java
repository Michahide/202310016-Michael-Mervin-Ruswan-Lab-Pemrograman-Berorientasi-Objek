package com.sample.app;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Latihan2 {
    public static void main(String[] args) {
        int inputButton = JOptionPane.showConfirmDialog(null, 
            "Apakah kamu suka burger?",
            "Pertanyaan",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if (inputButton == 0) {
            JOptionPane.showMessageDialog(null, "Saya suka burger", "Yes!", JOptionPane.INFORMATION_MESSAGE);
        } else if (inputButton == 1) {
            JOptionPane.showMessageDialog(null, "Saya tidak suka burger", "No :(", JOptionPane.INFORMATION_MESSAGE);
        } else if (inputButton == 2) {
            JOptionPane.showMessageDialog(null, "Tidak memilih", "Not choose anything :v", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
