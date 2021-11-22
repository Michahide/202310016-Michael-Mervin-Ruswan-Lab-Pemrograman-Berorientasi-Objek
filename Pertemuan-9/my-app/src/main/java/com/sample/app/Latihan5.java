package com.sample.app;

import javax.swing.JOptionPane;

public class Latihan5 {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "Masukkan namamu");
        while (nama.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field tidak boleh kosong", "Peringatan", JOptionPane.ERROR_MESSAGE);
            nama = JOptionPane.showInputDialog(null, "Masukkan namamu");
        }

        Latihan5 myObj = new Latihan5();
        
        String label ="";
        int inputButton = JOptionPane.showConfirmDialog(null, 
            "Apakah kamu suka burger?",
            "Pertanyaan",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if (inputButton == 0) {
            String jumlahBurgerString= JOptionPane.showInputDialog(null,"Harga burger: Rp 38.000\nMasukkan jumlah burger yang dipesan");
            while (myObj.isNumber(jumlahBurgerString) == false) {
                JOptionPane.showMessageDialog(null, "Input yang dimasukkan harus berupa angka", "Error", JOptionPane.ERROR_MESSAGE);
                jumlahBurgerString= JOptionPane.showInputDialog(null,"Harga burger: Rp 38.000\nMasukkan jumlah burger yang dipesan");
            }
            Double jumlahBurger = Double.parseDouble(jumlahBurgerString);
            Double hargaBurger = jumlahBurger*38000;
            String hargaBurgerString = hargaBurger+"";
            label = nama + " suka burger\nBurger yang dipesan: " + jumlahBurgerString + "\n Harga burger = " + hargaBurgerString ;
            JOptionPane.showMessageDialog(null, label, "Pilihan", JOptionPane.INFORMATION_MESSAGE);
        } else if (inputButton == 1) {
            label = nama + " tidak suka burger";
            JOptionPane.showMessageDialog(null, label, "Pilihan", JOptionPane.INFORMATION_MESSAGE);
        } else if (inputButton == 2) {
            JOptionPane.showMessageDialog(null, "Tidak memilih", "Not choose anything :v", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    public boolean isNumber(String jumlah) {
        try {
            Double x = Double.parseDouble(jumlah);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
