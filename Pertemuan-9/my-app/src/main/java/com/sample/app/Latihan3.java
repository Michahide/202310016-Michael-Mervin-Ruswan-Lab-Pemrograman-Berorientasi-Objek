package com.sample.app;

import javax.swing.JOptionPane;

public class Latihan3 {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "Masukkan namamu");
        String label ="";
        int inputButton = JOptionPane.showConfirmDialog(null, 
            "Apakah kamu suka burger?",
            "Pertanyaan",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if (inputButton == 0) {
            label = nama + " suka burger";
        } else if (inputButton == 1) {
            label = nama + " tidak suka burger";
        } else if (inputButton == 2) {
            label = nama + "Tidak memilih";
        }
        JOptionPane.showMessageDialog(null, label, "Pilihan", JOptionPane.INFORMATION_MESSAGE);
    }
}
