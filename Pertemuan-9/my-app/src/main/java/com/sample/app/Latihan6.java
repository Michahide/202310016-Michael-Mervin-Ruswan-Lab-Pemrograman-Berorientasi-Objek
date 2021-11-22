package com.sample.app;

import javax.swing.JOptionPane;

public class Latihan6 {
    public static String nama;
    public static String label;
    public static void main(String[] args) {
        nama = JOptionPane.showInputDialog(null, "Masukkan namamu"); //keluarkan input dialog untuk menanyakan nama
        while (nama.isEmpty()) { //Looping untuk error field/inputan yang kosong
            JOptionPane.showMessageDialog(null, "Field tidak boleh kosong", "Peringatan", JOptionPane.ERROR_MESSAGE); //keluarkan pesan error
            nama = JOptionPane.showInputDialog(null, "Masukkan namamu");
        }

        Latihan6 myObj = new Latihan6(); //buat objek baru bernama myObj
        int inputButton = JOptionPane.showConfirmDialog(null, 
            "Apakah kamu suka burger?",
            "Pertanyaan",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE); //buat confirm dialog dengan pertanyaan "Apakah kamu suka burger"
        if (inputButton == 0) { //kalau pilih Yes
            myObj.sukaBurger(); //memanggil fungsi sukaBurger
        } else if (inputButton == 1) { //kalau pilih no
            label = nama + " tidak suka burger";
            JOptionPane.showMessageDialog(null, label, "Pilihan", JOptionPane.INFORMATION_MESSAGE); //keluarkan pesan yang menyatakan user tidak suka burger
            int pilihanSuka = JOptionPane.showConfirmDialog(null, "Apakah kamu yakin?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE); //keluarkan pesan untuk menanyakan kepastian user
            if (pilihanSuka == 0) { //kalau pilih yes untuk pertanyaan "Apakah kamu yakin?"
                myObj.sukaBurger(); //panggil fungsi sukaBurger
            }

        } else if (inputButton == 2) { //kalau pilih cancel  untuk pertanyaan "Apakah kamu suka burger?"
            JOptionPane.showMessageDialog(null, "Tidak memilih", "Not choose anything :v", JOptionPane.INFORMATION_MESSAGE);
            int pilihanSuka = JOptionPane.showConfirmDialog(null, "Apakah kamu yakin?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (pilihanSuka == 0) { //kalau pilih yes untuk pertanyaan "Apakah kamu yakin?"
                myObj.sukaBurger(); //panggil fungsi sukaBurger
            }
        }
        
    }

    public void sukaBurger (){
        Latihan6 myObj = new Latihan6();
        String jumlahBurgerString= JOptionPane.showInputDialog(null,"Harga burger: Rp 38.000\nMasukkan jumlah burger yang dipesan");
        while (myObj.isNumber(jumlahBurgerString) == false) { //membuat looping unutk error message terkait input yang dimasukkan user harus berupa angka
            JOptionPane.showMessageDialog(null, "Input yang dimasukkan harus berupa angka", "Error", JOptionPane.ERROR_MESSAGE);
            jumlahBurgerString= JOptionPane.showInputDialog(null,"Harga burger: Rp 38.000\nMasukkan jumlah burger yang dipesan");
        }
        Double jumlahBurger = Double.parseDouble(jumlahBurgerString); //mengkonversi string yang berasal dari jumlahBurgerString
        Double hargaBurger = jumlahBurger*38000;
        String hargaBurgerString = hargaBurger+"";
        label = nama + " suka burger\nBurger yang dipesan: " + jumlahBurgerString + "\n Harga burger = " + hargaBurgerString ;
        JOptionPane.showMessageDialog(null, label, "Pilihan", JOptionPane.INFORMATION_MESSAGE); //mengeluarkan pesan dari variabel label
    }
    public boolean isNumber(String jumlah) { //membuat fungsi error handling/exception menggunakan try and catch
        try {
            Double x = Double.parseDouble(jumlah);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
